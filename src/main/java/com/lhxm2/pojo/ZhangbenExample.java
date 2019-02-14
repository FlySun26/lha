package com.lhxm2.pojo;

import java.util.ArrayList;
import java.util.List;

public class ZhangbenExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZhangbenExample() {
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

        public Criteria andZbRoleIsNull() {
            addCriterion("zb_role is null");
            return (Criteria) this;
        }

        public Criteria andZbRoleIsNotNull() {
            addCriterion("zb_role is not null");
            return (Criteria) this;
        }

        public Criteria andZbRoleEqualTo(Integer value) {
            addCriterion("zb_role =", value, "zbRole");
            return (Criteria) this;
        }

        public Criteria andZbRoleNotEqualTo(Integer value) {
            addCriterion("zb_role <>", value, "zbRole");
            return (Criteria) this;
        }

        public Criteria andZbRoleGreaterThan(Integer value) {
            addCriterion("zb_role >", value, "zbRole");
            return (Criteria) this;
        }

        public Criteria andZbRoleGreaterThanOrEqualTo(Integer value) {
            addCriterion("zb_role >=", value, "zbRole");
            return (Criteria) this;
        }

        public Criteria andZbRoleLessThan(Integer value) {
            addCriterion("zb_role <", value, "zbRole");
            return (Criteria) this;
        }

        public Criteria andZbRoleLessThanOrEqualTo(Integer value) {
            addCriterion("zb_role <=", value, "zbRole");
            return (Criteria) this;
        }

        public Criteria andZbRoleIn(List<Integer> values) {
            addCriterion("zb_role in", values, "zbRole");
            return (Criteria) this;
        }

        public Criteria andZbRoleNotIn(List<Integer> values) {
            addCriterion("zb_role not in", values, "zbRole");
            return (Criteria) this;
        }

        public Criteria andZbRoleBetween(Integer value1, Integer value2) {
            addCriterion("zb_role between", value1, value2, "zbRole");
            return (Criteria) this;
        }

        public Criteria andZbRoleNotBetween(Integer value1, Integer value2) {
            addCriterion("zb_role not between", value1, value2, "zbRole");
            return (Criteria) this;
        }

        public Criteria andZbNameIsNull() {
            addCriterion("zb_name is null");
            return (Criteria) this;
        }

        public Criteria andZbNameIsNotNull() {
            addCriterion("zb_name is not null");
            return (Criteria) this;
        }

        public Criteria andZbNameEqualTo(String value) {
            addCriterion("zb_name =", value, "zbName");
            return (Criteria) this;
        }

        public Criteria andZbNameNotEqualTo(String value) {
            addCriterion("zb_name <>", value, "zbName");
            return (Criteria) this;
        }

        public Criteria andZbNameGreaterThan(String value) {
            addCriterion("zb_name >", value, "zbName");
            return (Criteria) this;
        }

        public Criteria andZbNameGreaterThanOrEqualTo(String value) {
            addCriterion("zb_name >=", value, "zbName");
            return (Criteria) this;
        }

        public Criteria andZbNameLessThan(String value) {
            addCriterion("zb_name <", value, "zbName");
            return (Criteria) this;
        }

        public Criteria andZbNameLessThanOrEqualTo(String value) {
            addCriterion("zb_name <=", value, "zbName");
            return (Criteria) this;
        }

        public Criteria andZbNameLike(String value) {
            addCriterion("zb_name like", value, "zbName");
            return (Criteria) this;
        }

        public Criteria andZbNameNotLike(String value) {
            addCriterion("zb_name not like", value, "zbName");
            return (Criteria) this;
        }

        public Criteria andZbNameIn(List<String> values) {
            addCriterion("zb_name in", values, "zbName");
            return (Criteria) this;
        }

        public Criteria andZbNameNotIn(List<String> values) {
            addCriterion("zb_name not in", values, "zbName");
            return (Criteria) this;
        }

        public Criteria andZbNameBetween(String value1, String value2) {
            addCriterion("zb_name between", value1, value2, "zbName");
            return (Criteria) this;
        }

        public Criteria andZbNameNotBetween(String value1, String value2) {
            addCriterion("zb_name not between", value1, value2, "zbName");
            return (Criteria) this;
        }

        public Criteria andZbFmIsNull() {
            addCriterion("zb_fm is null");
            return (Criteria) this;
        }

        public Criteria andZbFmIsNotNull() {
            addCriterion("zb_fm is not null");
            return (Criteria) this;
        }

        public Criteria andZbFmEqualTo(String value) {
            addCriterion("zb_fm =", value, "zbFm");
            return (Criteria) this;
        }

        public Criteria andZbFmNotEqualTo(String value) {
            addCriterion("zb_fm <>", value, "zbFm");
            return (Criteria) this;
        }

        public Criteria andZbFmGreaterThan(String value) {
            addCriterion("zb_fm >", value, "zbFm");
            return (Criteria) this;
        }

        public Criteria andZbFmGreaterThanOrEqualTo(String value) {
            addCriterion("zb_fm >=", value, "zbFm");
            return (Criteria) this;
        }

        public Criteria andZbFmLessThan(String value) {
            addCriterion("zb_fm <", value, "zbFm");
            return (Criteria) this;
        }

        public Criteria andZbFmLessThanOrEqualTo(String value) {
            addCriterion("zb_fm <=", value, "zbFm");
            return (Criteria) this;
        }

        public Criteria andZbFmLike(String value) {
            addCriterion("zb_fm like", value, "zbFm");
            return (Criteria) this;
        }

        public Criteria andZbFmNotLike(String value) {
            addCriterion("zb_fm not like", value, "zbFm");
            return (Criteria) this;
        }

        public Criteria andZbFmIn(List<String> values) {
            addCriterion("zb_fm in", values, "zbFm");
            return (Criteria) this;
        }

        public Criteria andZbFmNotIn(List<String> values) {
            addCriterion("zb_fm not in", values, "zbFm");
            return (Criteria) this;
        }

        public Criteria andZbFmBetween(String value1, String value2) {
            addCriterion("zb_fm between", value1, value2, "zbFm");
            return (Criteria) this;
        }

        public Criteria andZbFmNotBetween(String value1, String value2) {
            addCriterion("zb_fm not between", value1, value2, "zbFm");
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