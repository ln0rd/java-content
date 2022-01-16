const { Sequelize } = require('sequelize');

const db = new Sequelize('hash', 'root', 'root', {
    host: 'mysql-database',
    dialect: 'mysql',
    port: 3306,
    database: 'hash',
    logging: false,
    define: {
      timestamps: false
  }
});

module.exports = db;
