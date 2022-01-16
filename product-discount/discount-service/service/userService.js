const userDao = require('../dao/userDao');

const userService = {
    getUserById: getUserById
}

async function getUserById(userId) {
    if (userId == 0 || userId == undefined) {
        return null
    }

    let userFromDatabase = await getUserByIdFromDatabase(userId)
    let user = extractUserFromDatabaseObject(userFromDatabase)
    return user;
}

async function getUserByIdFromDatabase(userId) {
    const user = userDao.findById(userId)
    return user;
}

function extractUserFromDatabaseObject(userFromDatabase) {
    return {
        first_name: userFromDatabase.dataValues.first_name,
        last_name: userFromDatabase.dataValues.last_name,
        date_of_birth: userFromDatabase.dataValues.date_of_birth
    }
}

module.exports = userService;