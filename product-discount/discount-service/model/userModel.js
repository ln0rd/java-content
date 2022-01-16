const Sequelize = require('sequelize');
const db = require('../database/sequelize');

const User = db.define('user', {
    first_name: Sequelize.STRING,
    last_name: Sequelize.STRING,
    date_of_birth: Sequelize.DATE
});

module.exports = User;