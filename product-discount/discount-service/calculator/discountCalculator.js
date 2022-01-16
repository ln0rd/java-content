const discountCalculator = {
    createDiscount: createDiscount,
    getBirthdayDiscountPercentage: getBirthdayDiscountPercentage,
    removeBirthdayFromDiscounts: removeBirthdayFromDiscounts,
    discountsLowerThanLimitOrEqual: discountsLowerThanLimitOrEqual,
    sumDiscountPorcentage: sumDiscountPorcentage
}

function createDiscount(productPrinceInCents, user, discounts, today) {
    let discountLimit = 10;
    let birthdayPercentage = getBirthdayDiscountPercentage(discounts, user, today)
    let discountsWithoutBirthdayList = removeBirthdayFromDiscounts(discounts)
    let listDiscounts = discountsLowerThanLimitOrEqual(discountsWithoutBirthdayList, discountLimit)

    return sumDiscountPorcentage(productPrinceInCents, birthdayPercentage, discountLimit, listDiscounts)
}

function getBirthdayDiscountPercentage(discounts, user, today) {
    let birthdayPercentage = 0;
    
    if (user == null) {
        return birthdayPercentage
    }
    
    let userBirthdayMonthDay = user.date_of_birth.slice(5,10)
    let todayMonthDay = today.slice(5,10)
    
    if (userBirthdayMonthDay == todayMonthDay) {
        discounts.map(function (item){
            if (item.name == 'birthday') {
                birthdayPercentage += item.percentage
            }
        })        
    }
    return birthdayPercentage;
}

function removeBirthdayFromDiscounts(discounts) {
    let discountsWithoutBirthdayList = []

    discounts.map(function (item) {
        if (item.name !== 'birthday') {
            discountsWithoutBirthdayList.push(item)
        }
    })
    return discountsWithoutBirthdayList;
}

function discountsLowerThanLimitOrEqual(discounts, discountLimit) {
    let discountsLowerThanLimitList = []

    discounts.map(function (item) {
        if (item.percentage <= discountLimit) {
            discountsLowerThanLimitList.push(item)
        }
    })
    return discountsLowerThanLimitList;
}

function sumDiscountPorcentage(productPrinceInCents, discountPercentage, discountLimit, listDiscounts) {
    listDiscounts.map(function (item) {
        if ((item.percentage + discountPercentage) <= discountLimit) {
            discountPercentage += item.percentage
        } else if (discountPercentage < item.percentage && item.percentage <= discountLimit) {
            discountPercentage = item.percentage 
        }
    })

    let valueOfDiscount = ((discountPercentage * (productPrinceInCents / 100)) / 100)
    let valueOfProductAfterDiscount = (((productPrinceInCents / 100) - valueOfDiscount) * 100)

    console.log(`
        Product value: ${productPrinceInCents}
        Percentage discount: ${discountPercentage}
        Discount value: ${valueOfDiscount}
        Product value after: ${valueOfProductAfterDiscount}`)
    
    return { valueInCents: valueOfProductAfterDiscount, percentage: discountPercentage}
}

module.exports = discountCalculator
