package com.lhxm2.pojo;

import java.util.ArrayList;
import java.util.List;

public class HandAccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HandAccountExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andHaIdIsNull() {
            addCriterion("ha_id is null");
            return (Criteria) this;
        }

        public Criteria andHaIdIsNotNull() {
            addCriterion("ha_id is not null");
            return (Criteria) this;
        }

        public Criteria andHaIdEqualTo(Integer value) {
            addCriterion("ha_id =", value, "haId");
            return (Criteria) this;
        }

        public Criteria andHaIdNotEqualTo(Integer value) {
            addCriterion("ha_id <>", value, "haId");
            return (Criteria) this;
        }

        public Criteria andHaIdGreaterThan(Integer value) {
            addCriterion("ha_id >", value, "haId");
            return (Criteria) this;
        }

        public Criteria andHaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ha_id >=", value, "haId");
            return (Criteria) this;
        }

        public Criteria andHaIdLessThan(Integer value) {
            addCriterion("ha_id <", value, "haId");
            return (Criteria) this;
        }

        public Criteria andHaIdLessThanOrEqualTo(Integer value) {
            addCriterion("ha_id <=", value, "haId");
            return (Criteria) this;
        }

        public Criteria andHaIdIn(List<Integer> values) {
            addCriterion("ha_id in", values, "haId");
            return (Criteria) this;
        }

        public Criteria andHaIdNotIn(List<Integer> values) {
            addCriterion("ha_id not in", values, "haId");
            return (Criteria) this;
        }

        public Criteria andHaIdBetween(Integer value1, Integer value2) {
            addCriterion("ha_id between", value1, value2, "haId");
            return (Criteria) this;
        }

        public Criteria andHaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ha_id not between", value1, value2, "haId");
            return (Criteria) this;
        }

        public Criteria andUIdIsNull() {
            addCriterion("u_id is null");
            return (Criteria) this;
        }

        public Criteria andUIdIsNotNull() {
            addCriterion("u_id is not null");
            return (Criteria) this;
        }

        public Criteria andUIdEqualTo(Integer value) {
            addCriterion("u_id =", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotEqualTo(Integer value) {
            addCriterion("u_id <>", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThan(Integer value) {
            addCriterion("u_id >", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_id >=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThan(Integer value) {
            addCriterion("u_id <", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThanOrEqualTo(Integer value) {
            addCriterion("u_id <=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdIn(List<Integer> values) {
            addCriterion("u_id in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotIn(List<Integer> values) {
            addCriterion("u_id not in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdBetween(Integer value1, Integer value2) {
            addCriterion("u_id between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotBetween(Integer value1, Integer value2) {
            addCriterion("u_id not between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andBgIdIsNull() {
            addCriterion("bg_id is null");
            return (Criteria) this;
        }

        public Criteria andBgIdIsNotNull() {
            addCriterion("bg_id is not null");
            return (Criteria) this;
        }

        public Criteria andBgIdEqualTo(Integer value) {
            addCriterion("bg_id =", value, "bgId");
            return (Criteria) this;
        }

        public Criteria andBgIdNotEqualTo(Integer value) {
            addCriterion("bg_id <>", value, "bgId");
            return (Criteria) this;
        }

        public Criteria andBgIdGreaterThan(Integer value) {
            addCriterion("bg_id >", value, "bgId");
            return (Criteria) this;
        }

        public Criteria andBgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bg_id >=", value, "bgId");
            return (Criteria) this;
        }

        public Criteria andBgIdLessThan(Integer value) {
            addCriterion("bg_id <", value, "bgId");
            return (Criteria) this;
        }

        public Criteria andBgIdLessThanOrEqualTo(Integer value) {
            addCriterion("bg_id <=", value, "bgId");
            return (Criteria) this;
        }

        public Criteria andBgIdIn(List<Integer> values) {
            addCriterion("bg_id in", values, "bgId");
            return (Criteria) this;
        }

        public Criteria andBgIdNotIn(List<Integer> values) {
            addCriterion("bg_id not in", values, "bgId");
            return (Criteria) this;
        }

        public Criteria andBgIdBetween(Integer value1, Integer value2) {
            addCriterion("bg_id between", value1, value2, "bgId");
            return (Criteria) this;
        }

        public Criteria andBgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bg_id not between", value1, value2, "bgId");
            return (Criteria) this;
        }

        public Criteria andHaStateIsNull() {
            addCriterion("ha_state is null");
            return (Criteria) this;
        }

        public Criteria andHaStateIsNotNull() {
            addCriterion("ha_state is not null");
            return (Criteria) this;
        }

        public Criteria andHaStateEqualTo(Integer value) {
            addCriterion("ha_state =", value, "haState");
            return (Criteria) this;
        }

        public Criteria andHaStateNotEqualTo(Integer value) {
            addCriterion("ha_state <>", value, "haState");
            return (Criteria) this;
        }

        public Criteria andHaStateGreaterThan(Integer value) {
            addCriterion("ha_state >", value, "haState");
            return (Criteria) this;
        }

        public Criteria andHaStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("ha_state >=", value, "haState");
            return (Criteria) this;
        }

        public Criteria andHaStateLessThan(Integer value) {
            addCriterion("ha_state <", value, "haState");
            return (Criteria) this;
        }

        public Criteria andHaStateLessThanOrEqualTo(Integer value) {
            addCriterion("ha_state <=", value, "haState");
            return (Criteria) this;
        }

        public Criteria andHaStateIn(List<Integer> values) {
            addCriterion("ha_state in", values, "haState");
            return (Criteria) this;
        }

        public Criteria andHaStateNotIn(List<Integer> values) {
            addCriterion("ha_state not in", values, "haState");
            return (Criteria) this;
        }

        public Criteria andHaStateBetween(Integer value1, Integer value2) {
            addCriterion("ha_state between", value1, value2, "haState");
            return (Criteria) this;
        }

        public Criteria andHaStateNotBetween(Integer value1, Integer value2) {
            addCriterion("ha_state not between", value1, value2, "haState");
            return (Criteria) this;
        }

        public Criteria andHaNameIsNull() {
            addCriterion("ha_name is null");
            return (Criteria) this;
        }

        public Criteria andHaNameIsNotNull() {
            addCriterion("ha_name is not null");
            return (Criteria) this;
        }

        public Criteria andHaNameEqualTo(String value) {
            addCriterion("ha_name =", value, "haName");
            return (Criteria) this;
        }

        public Criteria andHaNameNotEqualTo(String value) {
            addCriterion("ha_name <>", value, "haName");
            return (Criteria) this;
        }

        public Criteria andHaNameGreaterThan(String value) {
            addCriterion("ha_name >", value, "haName");
            return (Criteria) this;
        }

        public Criteria andHaNameGreaterThanOrEqualTo(String value) {
            addCriterion("ha_name >=", value, "haName");
            return (Criteria) this;
        }

        public Criteria andHaNameLessThan(String value) {
            addCriterion("ha_name <", value, "haName");
            return (Criteria) this;
        }

        public Criteria andHaNameLessThanOrEqualTo(String value) {
            addCriterion("ha_name <=", value, "haName");
            return (Criteria) this;
        }

        public Criteria andHaNameLike(String value) {
            addCriterion("ha_name like", value, "haName");
            return (Criteria) this;
        }

        public Criteria andHaNameNotLike(String value) {
            addCriterion("ha_name not like", value, "haName");
            return (Criteria) this;
        }

        public Criteria andHaNameIn(List<String> values) {
            addCriterion("ha_name in", values, "haName");
            return (Criteria) this;
        }

        public Criteria andHaNameNotIn(List<String> values) {
            addCriterion("ha_name not in", values, "haName");
            return (Criteria) this;
        }

        public Criteria andHaNameBetween(String value1, String value2) {
            addCriterion("ha_name between", value1, value2, "haName");
            return (Criteria) this;
        }

        public Criteria andHaNameNotBetween(String value1, String value2) {
            addCriterion("ha_name not between", value1, value2, "haName");
            return (Criteria) this;
        }

        public Criteria andZbIdIsNull() {
            addCriterion("zb_id is null");
            return (Criteria) this;
        }

        public Criteria andZbIdIsNotNull() {
            addCriterion("zb_id is not null");
            return (Criteria) this;
        }

        public Criteria andZbIdEqualTo(Integer value) {
            addCriterion("zb_id =", value, "zbId");
            return (Criteria) this;
        }

        public Criteria andZbIdNotEqualTo(Integer value) {
            addCriterion("zb_id <>", value, "zbId");
            return (Criteria) this;
        }

        public Criteria andZbIdGreaterThan(Integer value) {
            addCriterion("zb_id >", value, "zbId");
            return (Criteria) this;
        }

        public Criteria andZbIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("zb_id >=", value, "zbId");
            return (Criteria) this;
        }

        public Criteria andZbIdLessThan(Integer value) {
            addCriterion("zb_id <", value, "zbId");
            return (Criteria) this;
        }

        public Criteria andZbIdLessThanOrEqualTo(Integer value) {
            addCriterion("zb_id <=", value, "zbId");
            return (Criteria) this;
        }

        public Criteria andZbIdIn(List<Integer> values) {
            addCriterion("zb_id in", values, "zbId");
            return (Criteria) this;
        }

        public Criteria andZbIdNotIn(List<Integer> values) {
            addCriterion("zb_id not in", values, "zbId");
            return (Criteria) this;
        }

        public Criteria andZbIdBetween(Integer value1, Integer value2) {
            addCriterion("zb_id between", value1, value2, "zbId");
            return (Criteria) this;
        }

        public Criteria andZbIdNotBetween(Integer value1, Integer value2) {
            addCriterion("zb_id not between", value1, value2, "zbId");
            return (Criteria) this;
        }

        public Criteria andHaTimeIsNull() {
            addCriterion("ha_time is null");
            return (Criteria) this;
        }

        public Criteria andHaTimeIsNotNull() {
            addCriterion("ha_time is not null");
            return (Criteria) this;
        }

        public Criteria andHaTimeEqualTo(Integer value) {
            addCriterion("ha_time =", value, "haTime");
            return (Criteria) this;
        }

        public Criteria andHaTimeNotEqualTo(Integer value) {
            addCriterion("ha_time <>", value, "haTime");
            return (Criteria) this;
        }

        public Criteria andHaTimeGreaterThan(Integer value) {
            addCriterion("ha_time >", value, "haTime");
            return (Criteria) this;
        }

        public Criteria andHaTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ha_time >=", value, "haTime");
            return (Criteria) this;
        }

        public Criteria andHaTimeLessThan(Integer value) {
            addCriterion("ha_time <", value, "haTime");
            return (Criteria) this;
        }

        public Criteria andHaTimeLessThanOrEqualTo(Integer value) {
            addCriterion("ha_time <=", value, "haTime");
            return (Criteria) this;
        }

        public Criteria andHaTimeIn(List<Integer> values) {
            addCriterion("ha_time in", values, "haTime");
            return (Criteria) this;
        }

        public Criteria andHaTimeNotIn(List<Integer> values) {
            addCriterion("ha_time not in", values, "haTime");
            return (Criteria) this;
        }

        public Criteria andHaTimeBetween(Integer value1, Integer value2) {
            addCriterion("ha_time between", value1, value2, "haTime");
            return (Criteria) this;
        }

        public Criteria andHaTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("ha_time not between", value1, value2, "haTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}