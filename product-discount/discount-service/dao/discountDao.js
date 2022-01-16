const Discount = require('../model/discountModel');
const { Op } = require('sequelize');

var discoutDao = {
    findAllEnable: findAllEnable
}

async function findAllEnable(todayDayMonthYear) {
    return await Discount.findAll({ 
        where: {
        is_enable: true,
        [Op.or]: {
            [Op.and]: {
                begin_date: {
                    [Op.lte]: todayDayMonthYear
                },
                end_date: {
                    [Op.gte]: todayDayMonthYear
                }
            },
            [Op.or]: [{
                begin_date: null,
                end_date: null
            }]
        }
    }
});
}

module.exports = discoutDao;
