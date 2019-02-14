package com.lhxm2.pojo;

import java.util.ArrayList;
import java.util.List;

public class HaMubanChartletExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HaMubanChartletExample() {
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

        public Criteria andHmcIdIsNull() {
            addCriterion("hmc_id is null");
            return (Criteria) this;
        }

        public Criteria andHmcIdIsNotNull() {
            addCriterion("hmc_id is not null");
            return (Criteria) this;
        }

        public Criteria andHmcIdEqualTo(Integer value) {
            addCriterion("hmc_id =", value, "hmcId");
            return (Criteria) this;
        }

        public Criteria andHmcIdNotEqualTo(Integer value) {
            addCriterion("hmc_id <>", value, "hmcId");
            return (Criteria) this;
        }

        public Criteria andHmcIdGreaterThan(Integer value) {
            addCriterion("hmc_id >", value, "hmcId");
            return (Criteria) this;
        }

        public Criteria andHmcIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("hmc_id >=", value, "hmcId");
            return (Criteria) this;
        }

        public Criteria andHmcIdLessThan(Integer value) {
            addCriterion("hmc_id <", value, "hmcId");
            return (Criteria) this;
        }

        public Criteria andHmcIdLessThanOrEqualTo(Integer value) {
            addCriterion("hmc_id <=", value, "hmcId");
            return (Criteria) this;
        }

        public Criteria andHmcIdIn(List<Integer> values) {
            addCriterion("hmc_id in", values, "hmcId");
            return (Criteria) this;
        }

        public Criteria andHmcIdNotIn(List<Integer> values) {
            addCriterion("hmc_id not in", values, "hmcId");
            return (Criteria) this;
        }

        public Criteria andHmcIdBetween(Integer value1, Integer value2) {
            addCriterion("hmc_id between", value1, value2, "hmcId");
            return (Criteria) this;
        }

        public Criteria andHmcIdNotBetween(Integer value1, Integer value2) {
            addCriterion("hmc_id not between", value1, value2, "hmcId");
            return (Criteria) this;
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

        public Criteria andMuIdIsNull() {
            addCriterion("mu_id is null");
            return (Criteria) this;
        }

        public Criteria andMuIdIsNotNull() {
            addCriterion("mu_id is not null");
            return (Criteria) this;
        }

        public Criteria andMuIdEqualTo(Integer value) {
            addCriterion("mu_id =", value, "muId");
            return (Criteria) this;
        }

        public Criteria andMuIdNotEqualTo(Integer value) {
            addCriterion("mu_id <>", value, "muId");
            return (Criteria) this;
        }

        public Criteria andMuIdGreaterThan(Integer value) {
            addCriterion("mu_id >", value, "muId");
            return (Criteria) this;
        }

        public Criteria andMuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("mu_id >=", value, "muId");
            return (Criteria) this;
        }

        public Criteria andMuIdLessThan(Integer value) {
            addCriterion("mu_id <", value, "muId");
            return (Criteria) this;
        }

        public Criteria andMuIdLessThanOrEqualTo(Integer value) {
            addCriterion("mu_id <=", value, "muId");
            return (Criteria) this;
        }

        public Criteria andMuIdIn(List<Integer> values) {
            addCriterion("mu_id in", values, "muId");
            return (Criteria) this;
        }

        public Criteria andMuIdNotIn(List<Integer> values) {
            addCriterion("mu_id not in", values, "muId");
            return (Criteria) this;
        }

        public Criteria andMuIdBetween(Integer value1, Integer value2) {
            addCriterion("mu_id between", value1, value2, "muId");
            return (Criteria) this;
        }

        public Criteria andMuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("mu_id not between", value1, value2, "muId");
            return (Criteria) this;
        }

        public Criteria andCIdIsNull() {
            addCriterion("c_id is null");
            return (Criteria) this;
        }

        public Criteria andCIdIsNotNull() {
            addCriterion("c_id is not null");
            return (Criteria) this;
        }

        public Criteria andCIdEqualTo(Integer value) {
            addCriterion("c_id =", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotEqualTo(Integer value) {
            addCriterion("c_id <>", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThan(Integer value) {
            addCriterion("c_id >", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_id >=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThan(Integer value) {
            addCriterion("c_id <", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThanOrEqualTo(Integer value) {
            addCriterion("c_id <=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdIn(List<Integer> values) {
            addCriterion("c_id in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotIn(List<Integer> values) {
            addCriterion("c_id not in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdBetween(Integer value1, Integer value2) {
            addCriterion("c_id between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotBetween(Integer value1, Integer value2) {
            addCriterion("c_id not between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andHmcXIsNull() {
            addCriterion("hmc_x is null");
            return (Criteria) this;
        }

        public Criteria andHmcXIsNotNull() {
            addCriterion("hmc_x is not null");
            return (Criteria) this;
        }

        public Criteria andHmcXEqualTo(Integer value) {
            addCriterion("hmc_x =", value, "hmcX");
            return (Criteria) this;
        }

        public Criteria andHmcXNotEqualTo(Integer value) {
            addCriterion("hmc_x <>", value, "hmcX");
            return (Criteria) this;
        }

        public Criteria andHmcXGreaterThan(Integer value) {
            addCriterion("hmc_x >", value, "hmcX");
            return (Criteria) this;
        }

        public Criteria andHmcXGreaterThanOrEqualTo(Integer value) {
            addCriterion("hmc_x >=", value, "hmcX");
            return (Criteria) this;
        }

        public Criteria andHmcXLessThan(Integer value) {
            addCriterion("hmc_x <", value, "hmcX");
            return (Criteria) this;
        }

        public Criteria andHmcXLessThanOrEqualTo(Integer value) {
            addCriterion("hmc_x <=", value, "hmcX");
            return (Criteria) this;
        }

        public Criteria andHmcXIn(List<Integer> values) {
            addCriterion("hmc_x in", values, "hmcX");
            return (Criteria) this;
        }

        public Criteria andHmcXNotIn(List<Integer> values) {
            addCriterion("hmc_x not in", values, "hmcX");
            return (Criteria) this;
        }

        public Criteria andHmcXBetween(Integer value1, Integer value2) {
            addCriterion("hmc_x between", value1, value2, "hmcX");
            return (Criteria) this;
        }

        public Criteria andHmcXNotBetween(Integer value1, Integer value2) {
            addCriterion("hmc_x not between", value1, value2, "hmcX");
            return (Criteria) this;
        }

        public Criteria andHmcYIsNull() {
            addCriterion("hmc_y is null");
            return (Criteria) this;
        }

        public Criteria andHmcYIsNotNull() {
            addCriterion("hmc_y is not null");
            return (Criteria) this;
        }

        public Criteria andHmcYEqualTo(Integer value) {
            addCriterion("hmc_y =", value, "hmcY");
            return (Criteria) this;
        }

        public Criteria andHmcYNotEqualTo(Integer value) {
            addCriterion("hmc_y <>", value, "hmcY");
            return (Criteria) this;
        }

        public Criteria andHmcYGreaterThan(Integer value) {
            addCriterion("hmc_y >", value, "hmcY");
            return (Criteria) this;
        }

        public Criteria andHmcYGreaterThanOrEqualTo(Integer value) {
            addCriterion("hmc_y >=", value, "hmcY");
            return (Criteria) this;
        }

        public Criteria andHmcYLessThan(Integer value) {
            addCriterion("hmc_y <", value, "hmcY");
            return (Criteria) this;
        }

        public Criteria andHmcYLessThanOrEqualTo(Integer value) {
            addCriterion("hmc_y <=", value, "hmcY");
            return (Criteria) this;
        }

        public Criteria andHmcYIn(List<Integer> values) {
            addCriterion("hmc_y in", values, "hmcY");
            return (Criteria) this;
        }

        public Criteria andHmcYNotIn(List<Integer> values) {
            addCriterion("hmc_y not in", values, "hmcY");
            return (Criteria) this;
        }

        public Criteria andHmcYBetween(Integer value1, Integer value2) {
            addCriterion("hmc_y between", value1, value2, "hmcY");
            return (Criteria) this;
        }

        public Criteria andHmcYNotBetween(Integer value1, Integer value2) {
            addCriterion("hmc_y not between", value1, value2, "hmcY");
            return (Criteria) this;
        }

        public Criteria andHmcWidthIsNull() {
            addCriterion("hmc_width is null");
            return (Criteria) this;
        }

        public Criteria andHmcWidthIsNotNull() {
            addCriterion("hmc_width is not null");
            return (Criteria) this;
        }

        public Criteria andHmcWidthEqualTo(Integer value) {
            addCriterion("hmc_width =", value, "hmcWidth");
            return (Criteria) this;
        }

        public Criteria andHmcWidthNotEqualTo(Integer value) {
            addCriterion("hmc_width <>", value, "hmcWidth");
            return (Criteria) this;
        }

        public Criteria andHmcWidthGreaterThan(Integer value) {
            addCriterion("hmc_width >", value, "hmcWidth");
            return (Criteria) this;
        }

        public Criteria andHmcWidthGreaterThanOrEqualTo(Integer value) {
            addCriterion("hmc_width >=", value, "hmcWidth");
            return (Criteria) this;
        }

        public Criteria andHmcWidthLessThan(Integer value) {
            addCriterion("hmc_width <", value, "hmcWidth");
            return (Criteria) this;
        }

        public Criteria andHmcWidthLessThanOrEqualTo(Integer value) {
            addCriterion("hmc_width <=", value, "hmcWidth");
            return (Criteria) this;
        }

        public Criteria andHmcWidthIn(List<Integer> values) {
            addCriterion("hmc_width in", values, "hmcWidth");
            return (Criteria) this;
        }

        public Criteria andHmcWidthNotIn(List<Integer> values) {
            addCriterion("hmc_width not in", values, "hmcWidth");
            return (Criteria) this;
        }

        public Criteria andHmcWidthBetween(Integer value1, Integer value2) {
            addCriterion("hmc_width between", value1, value2, "hmcWidth");
            return (Criteria) this;
        }

        public Criteria andHmcWidthNotBetween(Integer value1, Integer value2) {
            addCriterion("hmc_width not between", value1, value2, "hmcWidth");
            return (Criteria) this;
        }

        public Criteria andHmcHeightIsNull() {
            addCriterion("hmc_height is null");
            return (Criteria) this;
        }

        public Criteria andHmcHeightIsNotNull() {
            addCriterion("hmc_height is not null");
            return (Criteria) this;
        }

        public Criteria andHmcHeightEqualTo(Integer value) {
            addCriterion("hmc_height =", value, "hmcHeight");
            return (Criteria) this;
        }

        public Criteria andHmcHeightNotEqualTo(Integer value) {
            addCriterion("hmc_height <>", value, "hmcHeight");
            return (Criteria) this;
        }

        public Criteria andHmcHeightGreaterThan(Integer value) {
            addCriterion("hmc_height >", value, "hmcHeight");
            return (Criteria) this;
        }

        public Criteria andHmcHeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("hmc_height >=", value, "hmcHeight");
            return (Criteria) this;
        }

        public Criteria andHmcHeightLessThan(Integer value) {
            addCriterion("hmc_height <", value, "hmcHeight");
            return (Criteria) this;
        }

        public Criteria andHmcHeightLessThanOrEqualTo(Integer value) {
            addCriterion("hmc_height <=", value, "hmcHeight");
            return (Criteria) this;
        }

        public Criteria andHmcHeightIn(List<Integer> values) {
            addCriterion("hmc_height in", values, "hmcHeight");
            return (Criteria) this;
        }

        public Criteria andHmcHeightNotIn(List<Integer> values) {
            addCriterion("hmc_height not in", values, "hmcHeight");
            return (Criteria) this;
        }

        public Criteria andHmcHeightBetween(Integer value1, Integer value2) {
            addCriterion("hmc_height between", value1, value2, "hmcHeight");
            return (Criteria) this;
        }

        public Criteria andHmcHeightNotBetween(Integer value1, Integer value2) {
            addCriterion("hmc_height not between", value1, value2, "hmcHeight");
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