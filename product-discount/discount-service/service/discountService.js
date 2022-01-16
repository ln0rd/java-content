const discountDao = require('../dao/discountDao')
const userService = require('./userService')
const discountCalculator = require('../calculator/discountCalculator')

const discountService = {
    getDiscount: getDiscount
} 

async function getDiscount (productPrinceInCents, userId) {
    let todayDayMonthYear = new Date().toISOString().slice(0,10)

    let discountsFromDatabase = await getAvailabesDiscountsFromDatabase(todayDayMonthYear)
    let discounts = extractDiscoutsFromList(discountsFromDatabase)
    
    let user = await getUserForApplyDiscount(userId)
    
    let discountCreated = discountCalculator.createDiscount(productPrinceInCents, user, discounts, todayDayMonthYear)

    return { message: `{ \"valueInCents\": \"${discountCreated.valueInCents}\", \"percentage\": \"${discountCreated.percentage}\" }`}
}

async function getAvailabesDiscountsFromDatabase(todayDayMonthYear) {
    const discountsAvailables = await discountDao.findAllEnable(todayDayMonthYear)
    return discountsAvailables;
}

async function getUserForApplyDiscount(userId) {
    let user = await userService.getUserById(userId)
    return user
}

function extractDiscoutsFromList(discountsFromDatabase) {
    return discountsFromDatabase.map(function (item) {
        return {
            percentage: item.dataValues.percentage,
            name: item.dataValues.name,
            begin_date: item.dataValues.begin_date,
            end_date: item.dataValues.end_date
        }
    })
}

module.exports = discountService;
