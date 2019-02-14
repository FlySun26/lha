package com.lhxm2.pojo;

import java.util.ArrayList;
import java.util.List;

public class DongtaiPicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DongtaiPicExample() {
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

        public Criteria andDpicIdIsNull() {
            addCriterion("dpic_id is null");
            return (Criteria) this;
        }

        public Criteria andDpicIdIsNotNull() {
            addCriterion("dpic_id is not null");
            return (Criteria) this;
        }

        public Criteria andDpicIdEqualTo(Integer value) {
            addCriterion("dpic_id =", value, "dpicId");
            return (Criteria) this;
        }

        public Criteria andDpicIdNotEqualTo(Integer value) {
            addCriterion("dpic_id <>", value, "dpicId");
            return (Criteria) this;
        }

        public Criteria andDpicIdGreaterThan(Integer value) {
            addCriterion("dpic_id >", value, "dpicId");
            return (Criteria) this;
        }

        public Criteria andDpicIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dpic_id >=", value, "dpicId");
            return (Criteria) this;
        }

        public Criteria andDpicIdLessThan(Integer value) {
            addCriterion("dpic_id <", value, "dpicId");
            return (Criteria) this;
        }

        public Criteria andDpicIdLessThanOrEqualTo(Integer value) {
            addCriterion("dpic_id <=", value, "dpicId");
            return (Criteria) this;
        }

        public Criteria andDpicIdIn(List<Integer> values) {
            addCriterion("dpic_id in", values, "dpicId");
            return (Criteria) this;
        }

        public Criteria andDpicIdNotIn(List<Integer> values) {
            addCriterion("dpic_id not in", values, "dpicId");
            return (Criteria) this;
        }

        public Criteria andDpicIdBetween(Integer value1, Integer value2) {
            addCriterion("dpic_id between", value1, value2, "dpicId");
            return (Criteria) this;
        }

        public Criteria andDpicIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dpic_id not between", value1, value2, "dpicId");
            return (Criteria) this;
        }

        public Criteria andDtIdIsNull() {
            addCriterion("dt_id is null");
            return (Criteria) this;
        }

        public Criteria andDtIdIsNotNull() {
            addCriterion("dt_id is not null");
            return (Criteria) this;
        }

        public Criteria andDtIdEqualTo(Integer value) {
            addCriterion("dt_id =", value, "dtId");
            return (Criteria) this;
        }

        public Criteria andDtIdNotEqualTo(Integer value) {
            addCriterion("dt_id <>", value, "dtId");
            return (Criteria) this;
        }

        public Criteria andDtIdGreaterThan(Integer value) {
            addCriterion("dt_id >", value, "dtId");
            return (Criteria) this;
        }

        public Criteria andDtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dt_id >=", value, "dtId");
            return (Criteria) this;
        }

        public Criteria andDtIdLessThan(Integer value) {
            addCriterion("dt_id <", value, "dtId");
            return (Criteria) this;
        }

        public Criteria andDtIdLessThanOrEqualTo(Integer value) {
            addCriterion("dt_id <=", value, "dtId");
            return (Criteria) this;
        }

        public Criteria andDtIdIn(List<Integer> values) {
            addCriterion("dt_id in", values, "dtId");
            return (Criteria) this;
        }

        public Criteria andDtIdNotIn(List<Integer> values) {
            addCriterion("dt_id not in", values, "dtId");
            return (Criteria) this;
        }

        public Criteria andDtIdBetween(Integer value1, Integer value2) {
            addCriterion("dt_id between", value1, value2, "dtId");
            return (Criteria) this;
        }

        public Criteria andDtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dt_id not between", value1, value2, "dtId");
            return (Criteria) this;
        }

        public Criteria andDpicUrlIsNull() {
            addCriterion("dpic_url is null");
            return (Criteria) this;
        }

        public Criteria andDpicUrlIsNotNull() {
            addCriterion("dpic_url is not null");
            return (Criteria) this;
        }

        public Criteria andDpicUrlEqualTo(String value) {
            addCriterion("dpic_url =", value, "dpicUrl");
            return (Criteria) this;
        }

        public Criteria andDpicUrlNotEqualTo(String value) {
            addCriterion("dpic_url <>", value, "dpicUrl");
            return (Criteria) this;
        }

        public Criteria andDpicUrlGreaterThan(String value) {
            addCriterion("dpic_url >", value, "dpicUrl");
            return (Criteria) this;
        }

        public Criteria andDpicUrlGreaterThanOrEqualTo(String value) {
            addCriterion("dpic_url >=", value, "dpicUrl");
            return (Criteria) this;
        }

        public Criteria andDpicUrlLessThan(String value) {
            addCriterion("dpic_url <", value, "dpicUrl");
            return (Criteria) this;
        }

        public Criteria andDpicUrlLessThanOrEqualTo(String value) {
            addCriterion("dpic_url <=", value, "dpicUrl");
            return (Criteria) this;
        }

        public Criteria andDpicUrlIn(List<String> values) {
            addCriterion("dpic_url in", values, "dpicUrl");
            return (Criteria) this;
        }

        public Criteria andDpicUrlNotIn(List<String> values) {
            addCriterion("dpic_url not in", values, "dpicUrl");
            return (Criteria) this;
        }

        public Criteria andDpicUrlBetween(String value1, String value2) {
            addCriterion("dpic_url between", value1, value2, "dpicUrl");
            return (Criteria) this;
        }

        public Criteria andDpicUrlNotBetween(String value1, String value2) {
            addCriterion("dpic_url not between", value1, value2, "dpicUrl");
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