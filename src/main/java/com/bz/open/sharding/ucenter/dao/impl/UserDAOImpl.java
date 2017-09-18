package com.bz.open.sharding.ucenter.dao.impl;

import com.bz.open.sharding.ucenter.dao.UserDAO;
import com.bz.open.sharding.ucenter.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAOImpl extends BaseDAOImpl<User> implements UserDAO {

    @Override
    public User getById(int id) {
        return get(id);
    }
}
