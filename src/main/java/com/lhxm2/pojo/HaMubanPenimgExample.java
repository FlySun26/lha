package com.lhxm2.pojo;

import java.util.ArrayList;
import java.util.List;

public class HaMubanPenimgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HaMubanPenimgExample() {
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

        public Criteria andHmpIdIsNull() {
            addCriterion("hmp_id is null");
            return (Criteria) this;
        }

        public Criteria andHmpIdIsNotNull() {
            addCriterion("hmp_id is not null");
            return (Criteria) this;
        }

        public Criteria andHmpIdEqualTo(Integer value) {
            addCriterion("hmp_id =", value, "hmpId");
            return (Criteria) this;
        }

        public Criteria andHmpIdNotEqualTo(Integer value) {
            addCriterion("hmp_id <>", value, "hmpId");
            return (Criteria) this;
        }

        public Criteria andHmpIdGreaterThan(Integer value) {
            addCriterion("hmp_id >", value, "hmpId");
            return (Criteria) this;
        }

        public Criteria andHmpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("hmp_id >=", value, "hmpId");
            return (Criteria) this;
        }

        public Criteria andHmpIdLessThan(Integer value) {
            addCriterion("hmp_id <", value, "hmpId");
            return (Criteria) this;
        }

        public Criteria andHmpIdLessThanOrEqualTo(Integer value) {
            addCriterion("hmp_id <=", value, "hmpId");
            return (Criteria) this;
        }

        public Criteria andHmpIdIn(List<Integer> values) {
            addCriterion("hmp_id in", values, "hmpId");
            return (Criteria) this;
        }

        public Criteria andHmpIdNotIn(List<Integer> values) {
            addCriterion("hmp_id not in", values, "hmpId");
            return (Criteria) this;
        }

        public Criteria andHmpIdBetween(Integer value1, Integer value2) {
            addCriterion("hmp_id between", value1, value2, "hmpId");
            return (Criteria) this;
        }

        public Criteria andHmpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("hmp_id not between", value1, value2, "hmpId");
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

        public Criteria andPIdIsNull() {
            addCriterion("p_id is null");
            return (Criteria) this;
        }

        public Criteria andPIdIsNotNull() {
            addCriterion("p_id is not null");
            return (Criteria) this;
        }

        public Criteria andPIdEqualTo(Integer value) {
            addCriterion("p_id =", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotEqualTo(Integer value) {
            addCriterion("p_id <>", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThan(Integer value) {
            addCriterion("p_id >", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("p_id >=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThan(Integer value) {
            addCriterion("p_id <", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThanOrEqualTo(Integer value) {
            addCriterion("p_id <=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdIn(List<Integer> values) {
            addCriterion("p_id in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotIn(List<Integer> values) {
            addCriterion("p_id not in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdBetween(Integer value1, Integer value2) {
            addCriterion("p_id between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotBetween(Integer value1, Integer value2) {
            addCriterion("p_id not between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andCXIsNull() {
            addCriterion("c_x is null");
            return (Criteria) this;
        }

        public Criteria andCXIsNotNull() {
            addCriterion("c_x is not null");
            return (Criteria) this;
        }

        public Criteria andCXEqualTo(Integer value) {
            addCriterion("c_x =", value, "cX");
            return (Criteria) this;
        }

        public Criteria andCXNotEqualTo(Integer value) {
            addCriterion("c_x <>", value, "cX");
            return (Criteria) this;
        }

        public Criteria andCXGreaterThan(Integer value) {
            addCriterion("c_x >", value, "cX");
            return (Criteria) this;
        }

        public Criteria andCXGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_x >=", value, "cX");
            return (Criteria) this;
        }

        public Criteria andCXLessThan(Integer value) {
            addCriterion("c_x <", value, "cX");
            return (Criteria) this;
        }

        public Criteria andCXLessThanOrEqualTo(Integer value) {
            addCriterion("c_x <=", value, "cX");
            return (Criteria) this;
        }

        public Criteria andCXIn(List<Integer> values) {
            addCriterion("c_x in", values, "cX");
            return (Criteria) this;
        }

        public Criteria andCXNotIn(List<Integer> values) {
            addCriterion("c_x not in", values, "cX");
            return (Criteria) this;
        }

        public Criteria andCXBetween(Integer value1, Integer value2) {
            addCriterion("c_x between", value1, value2, "cX");
            return (Criteria) this;
        }

        public Criteria andCXNotBetween(Integer value1, Integer value2) {
            addCriterion("c_x not between", value1, value2, "cX");
            return (Criteria) this;
        }

        public Criteria andCYIsNull() {
            addCriterion("c_y is null");
            return (Criteria) this;
        }

        public Criteria andCYIsNotNull() {
            addCriterion("c_y is not null");
            return (Criteria) this;
        }

        public Criteria andCYEqualTo(Integer value) {
            addCriterion("c_y =", value, "cY");
            return (Criteria) this;
        }

        public Criteria andCYNotEqualTo(Integer value) {
            addCriterion("c_y <>", value, "cY");
            return (Criteria) this;
        }

        public Criteria andCYGreaterThan(Integer value) {
            addCriterion("c_y >", value, "cY");
            return (Criteria) this;
        }

        public Criteria andCYGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_y >=", value, "cY");
            return (Criteria) this;
        }

        public Criteria andCYLessThan(Integer value) {
            addCriterion("c_y <", value, "cY");
            return (Criteria) this;
        }

        public Criteria andCYLessThanOrEqualTo(Integer value) {
            addCriterion("c_y <=", value, "cY");
            return (Criteria) this;
        }

        public Criteria andCYIn(List<Integer> values) {
            addCriterion("c_y in", values, "cY");
            return (Criteria) this;
        }

        public Criteria andCYNotIn(List<Integer> values) {
            addCriterion("c_y not in", values, "cY");
            return (Criteria) this;
        }

        public Criteria andCYBetween(Integer value1, Integer value2) {
            addCriterion("c_y between", value1, value2, "cY");
            return (Criteria) this;
        }

        public Criteria andCYNotBetween(Integer value1, Integer value2) {
            addCriterion("c_y not between", value1, value2, "cY");
            return (Criteria) this;
        }

        public Criteria andCSuofangIsNull() {
            addCriterion("c_suofang is null");
            return (Criteria) this;
        }

        public Criteria andCSuofangIsNotNull() {
            addCriterion("c_suofang is not null");
            return (Criteria) this;
        }

        public Criteria andCSuofangEqualTo(Integer value) {
            addCriterion("c_suofang =", value, "cSuofang");
            return (Criteria) this;
        }

        public Criteria andCSuofangNotEqualTo(Integer value) {
            addCriterion("c_suofang <>", value, "cSuofang");
            return (Criteria) this;
        }

        public Criteria andCSuofangGreaterThan(Integer value) {
            addCriterion("c_suofang >", value, "cSuofang");
            return (Criteria) this;
        }

        public Criteria andCSuofangGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_suofang >=", value, "cSuofang");
            return (Criteria) this;
        }

        public Criteria andCSuofangLessThan(Integer value) {
            addCriterion("c_suofang <", value, "cSuofang");
            return (Criteria) this;
        }

        public Criteria andCSuofangLessThanOrEqualTo(Integer value) {
            addCriterion("c_suofang <=", value, "cSuofang");
            return (Criteria) this;
        }

        public Criteria andCSuofangIn(List<Integer> values) {
            addCriterion("c_suofang in", values, "cSuofang");
            return (Criteria) this;
        }

        public Criteria andCSuofangNotIn(List<Integer> values) {
            addCriterion("c_suofang not in", values, "cSuofang");
            return (Criteria) this;
        }

        public Criteria andCSuofangBetween(Integer value1, Integer value2) {
            addCriterion("c_suofang between", value1, value2, "cSuofang");
            return (Criteria) this;
        }

        public Criteria andCSuofangNotBetween(Integer value1, Integer value2) {
            addCriterion("c_suofang not between", value1, value2, "cSuofang");
            return (Criteria) this;
        }

        public Criteria andCXuanzhuanIsNull() {
            addCriterion("c_xuanzhuan is null");
            return (Criteria) this;
        }

        public Criteria andCXuanzhuanIsNotNull() {
            addCriterion("c_xuanzhuan is not null");
            return (Criteria) this;
        }

        public Criteria andCXuanzhuanEqualTo(Integer value) {
            addCriterion("c_xuanzhuan =", value, "cXuanzhuan");
            return (Criteria) this;
        }

        public Criteria andCXuanzhuanNotEqualTo(Integer value) {
            addCriterion("c_xuanzhuan <>", value, "cXuanzhuan");
            return (Criteria) this;
        }

        public Criteria andCXuanzhuanGreaterThan(Integer value) {
            addCriterion("c_xuanzhuan >", value, "cXuanzhuan");
            return (Criteria) this;
        }

        public Criteria andCXuanzhuanGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_xuanzhuan >=", value, "cXuanzhuan");
            return (Criteria) this;
        }

        public Criteria andCXuanzhuanLessThan(Integer value) {
            addCriterion("c_xuanzhuan <", value, "cXuanzhuan");
            return (Criteria) this;
        }

        public Criteria andCXuanzhuanLessThanOrEqualTo(Integer value) {
            addCriterion("c_xuanzhuan <=", value, "cXuanzhuan");
            return (Criteria) this;
        }

        public Criteria andCXuanzhuanIn(List<Integer> values) {
            addCriterion("c_xuanzhuan in", values, "cXuanzhuan");
            return (Criteria) this;
        }

        public Criteria andCXuanzhuanNotIn(List<Integer> values) {
            addCriterion("c_xuanzhuan not in", values, "cXuanzhuan");
            return (Criteria) this;
        }

        public Criteria andCXuanzhuanBetween(Integer value1, Integer value2) {
            addCriterion("c_xuanzhuan between", value1, value2, "cXuanzhuan");
            return (Criteria) this;
        }

        public Criteria andCXuanzhuanNotBetween(Integer value1, Integer value2) {
            addCriterion("c_xuanzhuan not between", value1, value2, "cXuanzhuan");
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