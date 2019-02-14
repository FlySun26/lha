package com.lhxm2.pojo;

import java.util.ArrayList;
import java.util.List;

public class FocusExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FocusExample() {
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

        public Criteria andFIdIsNull() {
            addCriterion("f_id is null");
            return (Criteria) this;
        }

        public Criteria andFIdIsNotNull() {
            addCriterion("f_id is not null");
            return (Criteria) this;
        }

        public Criteria andFIdEqualTo(Integer value) {
            addCriterion("f_id =", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotEqualTo(Integer value) {
            addCriterion("f_id <>", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdGreaterThan(Integer value) {
            addCriterion("f_id >", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_id >=", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdLessThan(Integer value) {
            addCriterion("f_id <", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdLessThanOrEqualTo(Integer value) {
            addCriterion("f_id <=", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdIn(List<Integer> values) {
            addCriterion("f_id in", values, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotIn(List<Integer> values) {
            addCriterion("f_id not in", values, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdBetween(Integer value1, Integer value2) {
            addCriterion("f_id between", value1, value2, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotBetween(Integer value1, Integer value2) {
            addCriterion("f_id not between", value1, value2, "fId");
            return (Criteria) this;
        }

        public Criteria andFBefocusIsNull() {
            addCriterion("f_befocus is null");
            return (Criteria) this;
        }

        public Criteria andFBefocusIsNotNull() {
            addCriterion("f_befocus is not null");
            return (Criteria) this;
        }

        public Criteria andFBefocusEqualTo(Integer value) {
            addCriterion("f_befocus =", value, "fBefocus");
            return (Criteria) this;
        }

        public Criteria andFBefocusNotEqualTo(Integer value) {
            addCriterion("f_befocus <>", value, "fBefocus");
            return (Criteria) this;
        }

        public Criteria andFBefocusGreaterThan(Integer value) {
            addCriterion("f_befocus >", value, "fBefocus");
            return (Criteria) this;
        }

        public Criteria andFBefocusGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_befocus >=", value, "fBefocus");
            return (Criteria) this;
        }

        public Criteria andFBefocusLessThan(Integer value) {
            addCriterion("f_befocus <", value, "fBefocus");
            return (Criteria) this;
        }

        public Criteria andFBefocusLessThanOrEqualTo(Integer value) {
            addCriterion("f_befocus <=", value, "fBefocus");
            return (Criteria) this;
        }

        public Criteria andFBefocusIn(List<Integer> values) {
            addCriterion("f_befocus in", values, "fBefocus");
            return (Criteria) this;
        }

        public Criteria andFBefocusNotIn(List<Integer> values) {
            addCriterion("f_befocus not in", values, "fBefocus");
            return (Criteria) this;
        }

        public Criteria andFBefocusBetween(Integer value1, Integer value2) {
            addCriterion("f_befocus between", value1, value2, "fBefocus");
            return (Criteria) this;
        }

        public Criteria andFBefocusNotBetween(Integer value1, Integer value2) {
            addCriterion("f_befocus not between", value1, value2, "fBefocus");
            return (Criteria) this;
        }

        public Criteria andFFocusIsNull() {
            addCriterion("f_focus is null");
            return (Criteria) this;
        }

        public Criteria andFFocusIsNotNull() {
            addCriterion("f_focus is not null");
            return (Criteria) this;
        }

        public Criteria andFFocusEqualTo(Integer value) {
            addCriterion("f_focus =", value, "fFocus");
            return (Criteria) this;
        }

        public Criteria andFFocusNotEqualTo(Integer value) {
            addCriterion("f_focus <>", value, "fFocus");
            return (Criteria) this;
        }

        public Criteria andFFocusGreaterThan(Integer value) {
            addCriterion("f_focus >", value, "fFocus");
            return (Criteria) this;
        }

        public Criteria andFFocusGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_focus >=", value, "fFocus");
            return (Criteria) this;
        }

        public Criteria andFFocusLessThan(Integer value) {
            addCriterion("f_focus <", value, "fFocus");
            return (Criteria) this;
        }

        public Criteria andFFocusLessThanOrEqualTo(Integer value) {
            addCriterion("f_focus <=", value, "fFocus");
            return (Criteria) this;
        }

        public Criteria andFFocusIn(List<Integer> values) {
            addCriterion("f_focus in", values, "fFocus");
            return (Criteria) this;
        }

        public Criteria andFFocusNotIn(List<Integer> values) {
            addCriterion("f_focus not in", values, "fFocus");
            return (Criteria) this;
        }

        public Criteria andFFocusBetween(Integer value1, Integer value2) {
            addCriterion("f_focus between", value1, value2, "fFocus");
            return (Criteria) this;
        }

        public Criteria andFFocusNotBetween(Integer value1, Integer value2) {
            addCriterion("f_focus not between", value1, value2, "fFocus");
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