const Sequelize = require('sequelize');
const db = require('../database/sequelize');

const Discount = db.define('discount', {
  percentage: Sequelize.INTEGER,
  name: Sequelize.STRING,
  is_enable: Sequelize.BOOLEAN,
  begin_date: Sequelize.DATE,
  end_date: Sequelize.DATE
});

module.exports = Discount;