package com.lhxm2.pojo;

import java.util.ArrayList;
import java.util.List;

public class BgimgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BgimgExample() {
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

        public Criteria andbgUrlIsNull() {
            addCriterion("bg_url is null");
            return (Criteria) this;
        }

        public Criteria andbgUrlIsNotNull() {
            addCriterion("bg_url is not null");
            return (Criteria) this;
        }

        public Criteria andbgUrlEqualTo(String value) {
            addCriterion("bg_url =", value, "bgUrl");
            return (Criteria) this;
        }

        public Criteria andbgUrlNotEqualTo(String value) {
            addCriterion("bg_url <>", value, "bgUrl");
            return (Criteria) this;
        }

        public Criteria andbgUrlGreaterThan(String value) {
            addCriterion("bg_url >", value, "bgUrl");
            return (Criteria) this;
        }

        public Criteria andbgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("bg_url >=", value, "bgUrl");
            return (Criteria) this;
        }

        public Criteria andbgUrlLessThan(String value) {
            addCriterion("bg_url <", value, "bgUrl");
            return (Criteria) this;
        }

        public Criteria andbgUrlLessThanOrEqualTo(String value) {
            addCriterion("bg_url <=", value, "bgUrl");
            return (Criteria) this;
        }

        public Criteria andbgUrlLike(String value) {
            addCriterion("bg_url like", value, "bgUrl");
            return (Criteria) this;
        }

        public Criteria andbgUrlNotLike(String value) {
            addCriterion("bg_url not like", value, "bgUrl");
            return (Criteria) this;
        }

        public Criteria andbgUrlIn(List<String> values) {
            addCriterion("bg_url in", values, "bgUrl");
            return (Criteria) this;
        }

        public Criteria andbgUrlNotIn(List<String> values) {
            addCriterion("bg_url not in", values, "bgUrl");
            return (Criteria) this;
        }

        public Criteria andbgUrlBetween(String value1, String value2) {
            addCriterion("bg_url between", value1, value2, "bgUrl");
            return (Criteria) this;
        }

        public Criteria andbgUrlNotBetween(String value1, String value2) {
            addCriterion("bg_url not between", value1, value2, "bgUrl");
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