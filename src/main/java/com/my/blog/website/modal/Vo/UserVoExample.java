package com.my.blog.website.modal.Vo;

import com.my.blog.website.modal.BaseVoExample;
import com.my.blog.website.modal.GeneratedCriteria;

import java.util.List;


public class UserVoExample extends BaseVoExample<UserVoExample.Criteria> {

    @Override
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }


    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return this;
        }

        public Criteria andHomeUrlIsNull() {
            addCriterion("home_url is null");
            return this;
        }

        public Criteria andHomeUrlIsNotNull() {
            addCriterion("home_url is not null");
            return this;
        }

        public Criteria andHomeUrlEqualTo(String value) {
            addCriterion("home_url =", value, "homeUrl");
            return this;
        }

        public Criteria andHomeUrlNotEqualTo(String value) {
            addCriterion("home_url <>", value, "homeUrl");
            return this;
        }

        public Criteria andHomeUrlGreaterThan(String value) {
            addCriterion("home_url >", value, "homeUrl");
            return this;
        }

        public Criteria andHomeUrlGreaterThanOrEqualTo(String value) {
            addCriterion("home_url >=", value, "homeUrl");
            return this;
        }

        public Criteria andHomeUrlLessThan(String value) {
            addCriterion("home_url <", value, "homeUrl");
            return this;
        }

        public Criteria andHomeUrlLessThanOrEqualTo(String value) {
            addCriterion("home_url <=", value, "homeUrl");
            return this;
        }

        public Criteria andHomeUrlLike(String value) {
            addCriterion("home_url like", value, "homeUrl");
            return this;
        }

        public Criteria andHomeUrlNotLike(String value) {
            addCriterion("home_url not like", value, "homeUrl");
            return this;
        }

        public Criteria andHomeUrlIn(List<String> values) {
            addCriterion("home_url in", values, "homeUrl");
            return this;
        }

        public Criteria andHomeUrlNotIn(List<String> values) {
            addCriterion("home_url not in", values, "homeUrl");
            return this;
        }

        public Criteria andHomeUrlBetween(String value1, String value2) {
            addCriterion("home_url between", value1, value2, "homeUrl");
            return this;
        }

        public Criteria andHomeUrlNotBetween(String value1, String value2) {
            addCriterion("home_url not between", value1, value2, "homeUrl");
            return this;
        }

        public Criteria andScreenNameIsNull() {
            addCriterion("screen_name is null");
            return this;
        }

        public Criteria andScreenNameIsNotNull() {
            addCriterion("screen_name is not null");
            return this;
        }

        public Criteria andScreenNameEqualTo(String value) {
            addCriterion("screen_name =", value, "screenName");
            return this;
        }

        public Criteria andScreenNameNotEqualTo(String value) {
            addCriterion("screen_name <>", value, "screenName");
            return this;
        }

        public Criteria andScreenNameGreaterThan(String value) {
            addCriterion("screen_name >", value, "screenName");
            return this;
        }

        public Criteria andScreenNameGreaterThanOrEqualTo(String value) {
            addCriterion("screen_name >=", value, "screenName");
            return this;
        }

        public Criteria andScreenNameLessThan(String value) {
            addCriterion("screen_name <", value, "screenName");
            return this;
        }

        public Criteria andScreenNameLessThanOrEqualTo(String value) {
            addCriterion("screen_name <=", value, "screenName");
            return this;
        }

        public Criteria andScreenNameLike(String value) {
            addCriterion("screen_name like", value, "screenName");
            return this;
        }

        public Criteria andScreenNameNotLike(String value) {
            addCriterion("screen_name not like", value, "screenName");
            return this;
        }

        public Criteria andScreenNameIn(List<String> values) {
            addCriterion("screen_name in", values, "screenName");
            return this;
        }

        public Criteria andScreenNameNotIn(List<String> values) {
            addCriterion("screen_name not in", values, "screenName");
            return this;
        }

        public Criteria andScreenNameBetween(String value1, String value2) {
            addCriterion("screen_name between", value1, value2, "screenName");
            return this;
        }

        public Criteria andScreenNameNotBetween(String value1, String value2) {
            addCriterion("screen_name not between", value1, value2, "screenName");
            return this;
        }

        public Criteria andCreatedIsNull() {
            addCriterion("created is null");
            return this;
        }

        public Criteria andCreatedIsNotNull() {
            addCriterion("created is not null");
            return this;
        }

        public Criteria andCreatedEqualTo(Integer value) {
            addCriterion("created =", value, "created");
            return this;
        }

        public Criteria andCreatedNotEqualTo(Integer value) {
            addCriterion("created <>", value, "created");
            return this;
        }

        public Criteria andCreatedGreaterThan(Integer value) {
            addCriterion("created >", value, "created");
            return this;
        }

        public Criteria andCreatedGreaterThanOrEqualTo(Integer value) {
            addCriterion("created >=", value, "created");
            return this;
        }

        public Criteria andCreatedLessThan(Integer value) {
            addCriterion("created <", value, "created");
            return this;
        }

        public Criteria andCreatedLessThanOrEqualTo(Integer value) {
            addCriterion("created <=", value, "created");
            return this;
        }

        public Criteria andCreatedIn(List<Integer> values) {
            addCriterion("created in", values, "created");
            return this;
        }

        public Criteria andCreatedNotIn(List<Integer> values) {
            addCriterion("created not in", values, "created");
            return this;
        }

        public Criteria andCreatedBetween(Integer value1, Integer value2) {
            addCriterion("created between", value1, value2, "created");
            return this;
        }

        public Criteria andCreatedNotBetween(Integer value1, Integer value2) {
            addCriterion("created not between", value1, value2, "created");
            return this;
        }

        public Criteria andActivatedIsNull() {
            addCriterion("activated is null");
            return this;
        }

        public Criteria andActivatedIsNotNull() {
            addCriterion("activated is not null");
            return this;
        }

        public Criteria andActivatedEqualTo(Integer value) {
            addCriterion("activated =", value, "activated");
            return this;
        }

        public Criteria andActivatedNotEqualTo(Integer value) {
            addCriterion("activated <>", value, "activated");
            return this;
        }

        public Criteria andActivatedGreaterThan(Integer value) {
            addCriterion("activated >", value, "activated");
            return this;
        }

        public Criteria andActivatedGreaterThanOrEqualTo(Integer value) {
            addCriterion("activated >=", value, "activated");
            return this;
        }

        public Criteria andActivatedLessThan(Integer value) {
            addCriterion("activated <", value, "activated");
            return this;
        }

        public Criteria andActivatedLessThanOrEqualTo(Integer value) {
            addCriterion("activated <=", value, "activated");
            return this;
        }

        public Criteria andActivatedIn(List<Integer> values) {
            addCriterion("activated in", values, "activated");
            return this;
        }

        public Criteria andActivatedNotIn(List<Integer> values) {
            addCriterion("activated not in", values, "activated");
            return this;
        }

        public Criteria andActivatedBetween(Integer value1, Integer value2) {
            addCriterion("activated between", value1, value2, "activated");
            return this;
        }

        public Criteria andActivatedNotBetween(Integer value1, Integer value2) {
            addCriterion("activated not between", value1, value2, "activated");
            return this;
        }

        public Criteria andLoggedIsNull() {
            addCriterion("logged is null");
            return this;
        }

        public Criteria andLoggedIsNotNull() {
            addCriterion("logged is not null");
            return this;
        }

        public Criteria andLoggedEqualTo(Integer value) {
            addCriterion("logged =", value, "logged");
            return this;
        }

        public Criteria andLoggedNotEqualTo(Integer value) {
            addCriterion("logged <>", value, "logged");
            return this;
        }

        public Criteria andLoggedGreaterThan(Integer value) {
            addCriterion("logged >", value, "logged");
            return this;
        }

        public Criteria andLoggedGreaterThanOrEqualTo(Integer value) {
            addCriterion("logged >=", value, "logged");
            return this;
        }

        public Criteria andLoggedLessThan(Integer value) {
            addCriterion("logged <", value, "logged");
            return this;
        }

        public Criteria andLoggedLessThanOrEqualTo(Integer value) {
            addCriterion("logged <=", value, "logged");
            return this;
        }

        public Criteria andLoggedIn(List<Integer> values) {
            addCriterion("logged in", values, "logged");
            return this;
        }

        public Criteria andLoggedNotIn(List<Integer> values) {
            addCriterion("logged not in", values, "logged");
            return this;
        }

        public Criteria andLoggedBetween(Integer value1, Integer value2) {
            addCriterion("logged between", value1, value2, "logged");
            return this;
        }

        public Criteria andLoggedNotBetween(Integer value1, Integer value2) {
            addCriterion("logged not between", value1, value2, "logged");
            return this;
        }

        public Criteria andGroupNameIsNull() {
            addCriterion("group_name is null");
            return this;
        }

        public Criteria andGroupNameIsNotNull() {
            addCriterion("group_name is not null");
            return this;
        }

        public Criteria andGroupNameEqualTo(String value) {
            addCriterion("group_name =", value, "groupName");
            return this;
        }

        public Criteria andGroupNameNotEqualTo(String value) {
            addCriterion("group_name <>", value, "groupName");
            return this;
        }

        public Criteria andGroupNameGreaterThan(String value) {
            addCriterion("group_name >", value, "groupName");
            return this;
        }

        public Criteria andGroupNameGreaterThanOrEqualTo(String value) {
            addCriterion("group_name >=", value, "groupName");
            return this;
        }

        public Criteria andGroupNameLessThan(String value) {
            addCriterion("group_name <", value, "groupName");
            return this;
        }

        public Criteria andGroupNameLessThanOrEqualTo(String value) {
            addCriterion("group_name <=", value, "groupName");
            return this;
        }

        public Criteria andGroupNameLike(String value) {
            addCriterion("group_name like", value, "groupName");
            return this;
        }

        public Criteria andGroupNameNotLike(String value) {
            addCriterion("group_name not like", value, "groupName");
            return this;
        }

        public Criteria andGroupNameIn(List<String> values) {
            addCriterion("group_name in", values, "groupName");
            return this;
        }

        public Criteria andGroupNameNotIn(List<String> values) {
            addCriterion("group_name not in", values, "groupName");
            return this;
        }

        public Criteria andGroupNameBetween(String value1, String value2) {
            addCriterion("group_name between", value1, value2, "groupName");
            return this;
        }

        public Criteria andGroupNameNotBetween(String value1, String value2) {
            addCriterion("group_name not between", value1, value2, "groupName");
            return this;
        }
    }


}