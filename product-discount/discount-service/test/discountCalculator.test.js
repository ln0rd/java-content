const assert = require('assert');
const discountCalculator = require('../calculator/discountCalculator')

describe("sumDiscountPorcentage", function () {
    it("should apply discount", function () {
        let productPrinceInCents = 10000
        let discountPercentage = 0
        let discountLimit = 10
        let discountList = createDiscountList(5, 10)

        let discountCreated = discountCalculator.sumDiscountPorcentage(productPrinceInCents, discountPercentage, discountLimit, discountList)
        let valueOfDiscount = ((discountCreated.percentage * (productPrinceInCents / 100)) / 100)
        let valueOfProductAfterDiscount = (((productPrinceInCents / 100) - valueOfDiscount) * 100)

        assert.strictEqual(discountCreated.percentage, discountLimit)
        assert.strictEqual(discountCreated.valueInCents, valueOfProductAfterDiscount)
    })

    it("should apply discount sum the values of discounts availables", function () {
        let productPrinceInCents = 10000
        let discountPercentage = 0
        let discountLimit = 9
        let discountList = createDiscountList(5, 4)

        let discountCreated = discountCalculator.sumDiscountPorcentage(productPrinceInCents, discountPercentage, discountLimit, discountList)
        let valueOfDiscount = ((discountCreated.percentage * (productPrinceInCents / 100)) / 100)
        let valueOfProductAfterDiscount = (((productPrinceInCents / 100) - valueOfDiscount) * 100)

        assert.strictEqual(discountCreated.percentage, discountLimit)
        assert.strictEqual(discountCreated.valueInCents, valueOfProductAfterDiscount)
    })

    it("should apply discount with the values of discounts availables and a small limit", function () {
        let productPrinceInCents = 10000
        let discountPercentage = 0
        let discountLimit = 4
        let discountList = createDiscountList(4, 5)

        let discountCreated = discountCalculator.sumDiscountPorcentage(productPrinceInCents, discountPercentage, discountLimit, discountList)
        let valueOfDiscount = ((discountCreated.percentage * (productPrinceInCents / 100)) / 100)
        let valueOfProductAfterDiscount = (((productPrinceInCents / 100) - valueOfDiscount) * 100)

        assert.strictEqual(discountCreated.percentage, discountLimit)
        assert.strictEqual(discountCreated.valueInCents, valueOfProductAfterDiscount)
    })
})

describe("discountsLowerThanLimitOrEqual", function () {
    it("Getting discounts lower than limite or equal, bringing just one", function () {
        let listdiscountsCreated = createDiscountList(4,6)
        let discountLimit = 5
        
        let discounts = discountCalculator.discountsLowerThanLimitOrEqual(listdiscountsCreated, discountLimit)

        assert.strictEqual(discounts.length, 1)
        assert.strictEqual(discounts[0].percentage, 4)
    })

    it("Getting discounts lower than limite or equal, bringing two", function () {
        let listdiscountsCreated = createDiscountList(4,5)
        let discountLimit = 5
        
        let discounts = discountCalculator.discountsLowerThanLimitOrEqual(listdiscountsCreated, discountLimit)

        assert.strictEqual(discounts.length, 2)
    })

    it("Getting discounts lower than limite or equal, bringing anyone", function () {
        let listdiscountsCreated = createDiscountList(6,6)
        let discountLimit = 5
        
        let discounts = discountCalculator.discountsLowerThanLimitOrEqual(listdiscountsCreated, discountLimit)

        assert.strictEqual(discounts.length, 0)
    })
})

describe("removeBirthdayFromDiscounts", function () {
    it("Remove the birthday discount in list of discounts when it exist", function () {
        let discountsCreated = createDiscountList(4, 5)
        let hasBirthday = false

        let discountsWithoutBirthday = discountCalculator.removeBirthdayFromDiscounts(discountsCreated)

        discountsWithoutBirthday.map(function (item) {
            if (item.name == 'birthday') {
                hasBirthday = true
            }
        })

        assert.strictEqual(hasBirthday, false)
        assert.strictEqual(discountsWithoutBirthday.length, 1)
    })

    it("Remove the birthday discount in list of discounts when it NOT exist", function () {
        let discountsCreated = createDiscountListWithoutBirthdayDiscount(4)
        let hasBirthday = false

        let discountsWithoutBirthday = discountCalculator.removeBirthdayFromDiscounts(discountsCreated)

        discountsWithoutBirthday.map(function (item) {
            if (item.name == 'birthday') {
                hasBirthday = true
            }
        })

        assert.strictEqual(hasBirthday, false)
        assert.strictEqual(discountsWithoutBirthday.length, 1)
    })
})

describe("getBirthdayDiscountPercentage", function () {
    it("Getting birthday percentage, should be zero", function () {
        let discountsCreated = createDiscountList(4,5)
        let user = createUser('1999-11-16')
        let todayDayMonthYear = new Date().toISOString().slice(0,10)

        if (todayDayMonthYear.slice(5,10) == user.date_of_birth.slice(5,10)) { user.date_of_birth == '1999-11-15' }

        let birthdayPercentage = discountCalculator.getBirthdayDiscountPercentage(discountsCreated, user, todayDayMonthYear)
        
        assert.strictEqual(birthdayPercentage, 0)

    })

    it("Getting birthday percentage, should be five", function () {
        let discountsCreated = createDiscountList(0,5)
        let todayDayMonthYear = new Date().toISOString().slice(0,10)
        let user = createUser(todayDayMonthYear)

        let birthdayPercentage = discountCalculator.getBirthdayDiscountPercentage(discountsCreated, user, todayDayMonthYear)
        
        assert.strictEqual(birthdayPercentage, 5)

    })

    it("Getting birthday percentage from null, should be zero", function () {
        let discountsCreated = createDiscountList(0,5)
        let todayDayMonthYear = new Date().toISOString().slice(0,10)
        let user = null

        let birthdayPercentage = discountCalculator.getBirthdayDiscountPercentage(discountsCreated, user, todayDayMonthYear)
        
        assert.strictEqual(birthdayPercentage, 0)

    })
})

describe("createDiscount", function () {
    it("Creating a discount", function () {
        let productPrinceInCents = 10000
        let today = new Date().toISOString().slice(0,10)
        let user = createUser(today)
        let discounts = createDiscountList(4, 5)

        let discountCreated = discountCalculator.createDiscount(productPrinceInCents, user, discounts, today)
        let valueOfDiscount = ((discountCreated.percentage * (productPrinceInCents / 100)) / 100)
        let valueOfProductAfterDiscount = (((productPrinceInCents / 100) - valueOfDiscount) * 100)

        assert.strictEqual(discountCreated.valueInCents, valueOfProductAfterDiscount)
    })
})


function createUser(date_of_birth) {
    return { date_of_birth: date_of_birth }
}

function createDiscountList(percentageBlackFriday, percentageValueBirthday) {
    return [
        {
            percentage: percentageBlackFriday,
            name: "black_friday",
            begin_date: '2021-11-25',
            end_date: '2021-11-25'
        },
        {
            percentage: percentageValueBirthday,
            name: "birthday",
            begin_date: null,
            end_date: null
        }
    ]
}

function createDiscountListWithoutBirthdayDiscount(percentageBlackFriday) {
    return [
        {
            percentage: percentageBlackFriday,
            name: "black_friday",
            begin_date: '2021-11-25',
            end_date: '2021-11-25'
        }]
}