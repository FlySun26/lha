package com.lhxm2.pojo;

import java.util.ArrayList;
import java.util.List;

public class HaMubanTextExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HaMubanTextExample() {
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

        public Criteria andHmtIdIsNull() {
            addCriterion("hmt_id is null");
            return (Criteria) this;
        }

        public Criteria andHmtIdIsNotNull() {
            addCriterion("hmt_id is not null");
            return (Criteria) this;
        }

        public Criteria andHmtIdEqualTo(Integer value) {
            addCriterion("hmt_id =", value, "hmtId");
            return (Criteria) this;
        }

        public Criteria andHmtIdNotEqualTo(Integer value) {
            addCriterion("hmt_id <>", value, "hmtId");
            return (Criteria) this;
        }

        public Criteria andHmtIdGreaterThan(Integer value) {
            addCriterion("hmt_id >", value, "hmtId");
            return (Criteria) this;
        }

        public Criteria andHmtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("hmt_id >=", value, "hmtId");
            return (Criteria) this;
        }

        public Criteria andHmtIdLessThan(Integer value) {
            addCriterion("hmt_id <", value, "hmtId");
            return (Criteria) this;
        }

        public Criteria andHmtIdLessThanOrEqualTo(Integer value) {
            addCriterion("hmt_id <=", value, "hmtId");
            return (Criteria) this;
        }

        public Criteria andHmtIdIn(List<Integer> values) {
            addCriterion("hmt_id in", values, "hmtId");
            return (Criteria) this;
        }

        public Criteria andHmtIdNotIn(List<Integer> values) {
            addCriterion("hmt_id not in", values, "hmtId");
            return (Criteria) this;
        }

        public Criteria andHmtIdBetween(Integer value1, Integer value2) {
            addCriterion("hmt_id between", value1, value2, "hmtId");
            return (Criteria) this;
        }

        public Criteria andHmtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("hmt_id not between", value1, value2, "hmtId");
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

        public Criteria andHmtTextIsNull() {
            addCriterion("hmt_text is null");
            return (Criteria) this;
        }

        public Criteria andHmtTextIsNotNull() {
            addCriterion("hmt_text is not null");
            return (Criteria) this;
        }

        public Criteria andHmtTextEqualTo(String value) {
            addCriterion("hmt_text =", value, "hmtText");
            return (Criteria) this;
        }

        public Criteria andHmtTextNotEqualTo(String value) {
            addCriterion("hmt_text <>", value, "hmtText");
            return (Criteria) this;
        }

        public Criteria andHmtTextGreaterThan(String value) {
            addCriterion("hmt_text >", value, "hmtText");
            return (Criteria) this;
        }

        public Criteria andHmtTextGreaterThanOrEqualTo(String value) {
            addCriterion("hmt_text >=", value, "hmtText");
            return (Criteria) this;
        }

        public Criteria andHmtTextLessThan(String value) {
            addCriterion("hmt_text <", value, "hmtText");
            return (Criteria) this;
        }

        public Criteria andHmtTextLessThanOrEqualTo(String value) {
            addCriterion("hmt_text <=", value, "hmtText");
            return (Criteria) this;
        }

        public Criteria andHmtTextLike(String value) {
            addCriterion("hmt_text like", value, "hmtText");
            return (Criteria) this;
        }

        public Criteria andHmtTextNotLike(String value) {
            addCriterion("hmt_text not like", value, "hmtText");
            return (Criteria) this;
        }

        public Criteria andHmtTextIn(List<String> values) {
            addCriterion("hmt_text in", values, "hmtText");
            return (Criteria) this;
        }

        public Criteria andHmtTextNotIn(List<String> values) {
            addCriterion("hmt_text not in", values, "hmtText");
            return (Criteria) this;
        }

        public Criteria andHmtTextBetween(String value1, String value2) {
            addCriterion("hmt_text between", value1, value2, "hmtText");
            return (Criteria) this;
        }

        public Criteria andHmtTextNotBetween(String value1, String value2) {
            addCriterion("hmt_text not between", value1, value2, "hmtText");
            return (Criteria) this;
        }

        public Criteria andFsIdIsNull() {
            addCriterion("fs_id is null");
            return (Criteria) this;
        }

        public Criteria andFsIdIsNotNull() {
            addCriterion("fs_id is not null");
            return (Criteria) this;
        }

        public Criteria andFsIdEqualTo(Integer value) {
            addCriterion("fs_id =", value, "fsId");
            return (Criteria) this;
        }

        public Criteria andFsIdNotEqualTo(Integer value) {
            addCriterion("fs_id <>", value, "fsId");
            return (Criteria) this;
        }

        public Criteria andFsIdGreaterThan(Integer value) {
            addCriterion("fs_id >", value, "fsId");
            return (Criteria) this;
        }

        public Criteria andFsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("fs_id >=", value, "fsId");
            return (Criteria) this;
        }

        public Criteria andFsIdLessThan(Integer value) {
            addCriterion("fs_id <", value, "fsId");
            return (Criteria) this;
        }

        public Criteria andFsIdLessThanOrEqualTo(Integer value) {
            addCriterion("fs_id <=", value, "fsId");
            return (Criteria) this;
        }

        public Criteria andFsIdIn(List<Integer> values) {
            addCriterion("fs_id in", values, "fsId");
            return (Criteria) this;
        }

        public Criteria andFsIdNotIn(List<Integer> values) {
            addCriterion("fs_id not in", values, "fsId");
            return (Criteria) this;
        }

        public Criteria andFsIdBetween(Integer value1, Integer value2) {
            addCriterion("fs_id between", value1, value2, "fsId");
            return (Criteria) this;
        }

        public Criteria andFsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("fs_id not between", value1, value2, "fsId");
            return (Criteria) this;
        }

        public Criteria andHmtSizeIsNull() {
            addCriterion("hmt_size is null");
            return (Criteria) this;
        }

        public Criteria andHmtSizeIsNotNull() {
            addCriterion("hmt_size is not null");
            return (Criteria) this;
        }

        public Criteria andHmtSizeEqualTo(Integer value) {
            addCriterion("hmt_size =", value, "hmtSize");
            return (Criteria) this;
        }

        public Criteria andHmtSizeNotEqualTo(Integer value) {
            addCriterion("hmt_size <>", value, "hmtSize");
            return (Criteria) this;
        }

        public Criteria andHmtSizeGreaterThan(Integer value) {
            addCriterion("hmt_size >", value, "hmtSize");
            return (Criteria) this;
        }

        public Criteria andHmtSizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("hmt_size >=", value, "hmtSize");
            return (Criteria) this;
        }

        public Criteria andHmtSizeLessThan(Integer value) {
            addCriterion("hmt_size <", value, "hmtSize");
            return (Criteria) this;
        }

        public Criteria andHmtSizeLessThanOrEqualTo(Integer value) {
            addCriterion("hmt_size <=", value, "hmtSize");
            return (Criteria) this;
        }

        public Criteria andHmtSizeIn(List<Integer> values) {
            addCriterion("hmt_size in", values, "hmtSize");
            return (Criteria) this;
        }

        public Criteria andHmtSizeNotIn(List<Integer> values) {
            addCriterion("hmt_size not in", values, "hmtSize");
            return (Criteria) this;
        }

        public Criteria andHmtSizeBetween(Integer value1, Integer value2) {
            addCriterion("hmt_size between", value1, value2, "hmtSize");
            return (Criteria) this;
        }

        public Criteria andHmtSizeNotBetween(Integer value1, Integer value2) {
            addCriterion("hmt_size not between", value1, value2, "hmtSize");
            return (Criteria) this;
        }

        public Criteria andHmtColorIsNull() {
            addCriterion("hmt_color is null");
            return (Criteria) this;
        }

        public Criteria andHmtColorIsNotNull() {
            addCriterion("hmt_color is not null");
            return (Criteria) this;
        }

        public Criteria andHmtColorEqualTo(String value) {
            addCriterion("hmt_color =", value, "hmtColor");
            return (Criteria) this;
        }

        public Criteria andHmtColorNotEqualTo(String value) {
            addCriterion("hmt_color <>", value, "hmtColor");
            return (Criteria) this;
        }

        public Criteria andHmtColorGreaterThan(String value) {
            addCriterion("hmt_color >", value, "hmtColor");
            return (Criteria) this;
        }

        public Criteria andHmtColorGreaterThanOrEqualTo(String value) {
            addCriterion("hmt_color >=", value, "hmtColor");
            return (Criteria) this;
        }

        public Criteria andHmtColorLessThan(String value) {
            addCriterion("hmt_color <", value, "hmtColor");
            return (Criteria) this;
        }

        public Criteria andHmtColorLessThanOrEqualTo(String value) {
            addCriterion("hmt_color <=", value, "hmtColor");
            return (Criteria) this;
        }

        public Criteria andHmtColorLike(String value) {
            addCriterion("hmt_color like", value, "hmtColor");
            return (Criteria) this;
        }

        public Criteria andHmtColorNotLike(String value) {
            addCriterion("hmt_color not like", value, "hmtColor");
            return (Criteria) this;
        }

        public Criteria andHmtColorIn(List<String> values) {
            addCriterion("hmt_color in", values, "hmtColor");
            return (Criteria) this;
        }

        public Criteria andHmtColorNotIn(List<String> values) {
            addCriterion("hmt_color not in", values, "hmtColor");
            return (Criteria) this;
        }

        public Criteria andHmtColorBetween(String value1, String value2) {
            addCriterion("hmt_color between", value1, value2, "hmtColor");
            return (Criteria) this;
        }

        public Criteria andHmtColorNotBetween(String value1, String value2) {
            addCriterion("hmt_color not between", value1, value2, "hmtColor");
            return (Criteria) this;
        }

        public Criteria andHmtColorlvIsNull() {
            addCriterion("hmt_colorlv is null");
            return (Criteria) this;
        }

        public Criteria andHmtColorlvIsNotNull() {
            addCriterion("hmt_colorlv is not null");
            return (Criteria) this;
        }

        public Criteria andHmtColorlvEqualTo(Integer value) {
            addCriterion("hmt_colorlv =", value, "hmtColorlv");
            return (Criteria) this;
        }

        public Criteria andHmtColorlvNotEqualTo(Integer value) {
            addCriterion("hmt_colorlv <>", value, "hmtColorlv");
            return (Criteria) this;
        }

        public Criteria andHmtColorlvGreaterThan(Integer value) {
            addCriterion("hmt_colorlv >", value, "hmtColorlv");
            return (Criteria) this;
        }

        public Criteria andHmtColorlvGreaterThanOrEqualTo(Integer value) {
            addCriterion("hmt_colorlv >=", value, "hmtColorlv");
            return (Criteria) this;
        }

        public Criteria andHmtColorlvLessThan(Integer value) {
            addCriterion("hmt_colorlv <", value, "hmtColorlv");
            return (Criteria) this;
        }

        public Criteria andHmtColorlvLessThanOrEqualTo(Integer value) {
            addCriterion("hmt_colorlv <=", value, "hmtColorlv");
            return (Criteria) this;
        }

        public Criteria andHmtColorlvIn(List<Integer> values) {
            addCriterion("hmt_colorlv in", values, "hmtColorlv");
            return (Criteria) this;
        }

        public Criteria andHmtColorlvNotIn(List<Integer> values) {
            addCriterion("hmt_colorlv not in", values, "hmtColorlv");
            return (Criteria) this;
        }

        public Criteria andHmtColorlvBetween(Integer value1, Integer value2) {
            addCriterion("hmt_colorlv between", value1, value2, "hmtColorlv");
            return (Criteria) this;
        }

        public Criteria andHmtColorlvNotBetween(Integer value1, Integer value2) {
            addCriterion("hmt_colorlv not between", value1, value2, "hmtColorlv");
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