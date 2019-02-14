package com.lhxm2.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DongtaiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DongtaiExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andDtTextIsNull() {
            addCriterion("dt_text is null");
            return (Criteria) this;
        }

        public Criteria andDtTextIsNotNull() {
            addCriterion("dt_text is not null");
            return (Criteria) this;
        }

        public Criteria andDtTextEqualTo(String value) {
            addCriterion("dt_text =", value, "dtText");
            return (Criteria) this;
        }

        public Criteria andDtTextNotEqualTo(String value) {
            addCriterion("dt_text <>", value, "dtText");
            return (Criteria) this;
        }

        public Criteria andDtTextGreaterThan(String value) {
            addCriterion("dt_text >", value, "dtText");
            return (Criteria) this;
        }

        public Criteria andDtTextGreaterThanOrEqualTo(String value) {
            addCriterion("dt_text >=", value, "dtText");
            return (Criteria) this;
        }

        public Criteria andDtTextLessThan(String value) {
            addCriterion("dt_text <", value, "dtText");
            return (Criteria) this;
        }

        public Criteria andDtTextLessThanOrEqualTo(String value) {
            addCriterion("dt_text <=", value, "dtText");
            return (Criteria) this;
        }

        public Criteria andDtTextLike(String value) {
            addCriterion("dt_text like", value, "dtText");
            return (Criteria) this;
        }

        public Criteria andDtTextNotLike(String value) {
            addCriterion("dt_text not like", value, "dtText");
            return (Criteria) this;
        }

        public Criteria andDtTextIn(List<String> values) {
            addCriterion("dt_text in", values, "dtText");
            return (Criteria) this;
        }

        public Criteria andDtTextNotIn(List<String> values) {
            addCriterion("dt_text not in", values, "dtText");
            return (Criteria) this;
        }

        public Criteria andDtTextBetween(String value1, String value2) {
            addCriterion("dt_text between", value1, value2, "dtText");
            return (Criteria) this;
        }

        public Criteria andDtTextNotBetween(String value1, String value2) {
            addCriterion("dt_text not between", value1, value2, "dtText");
            return (Criteria) this;
        }

        public Criteria andDtAddressIsNull() {
            addCriterion("dt_address is null");
            return (Criteria) this;
        }

        public Criteria andDtAddressIsNotNull() {
            addCriterion("dt_address is not null");
            return (Criteria) this;
        }

        public Criteria andDtAddressEqualTo(String value) {
            addCriterion("dt_address =", value, "dtAddress");
            return (Criteria) this;
        }

        public Criteria andDtAddressNotEqualTo(String value) {
            addCriterion("dt_address <>", value, "dtAddress");
            return (Criteria) this;
        }

        public Criteria andDtAddressGreaterThan(String value) {
            addCriterion("dt_address >", value, "dtAddress");
            return (Criteria) this;
        }

        public Criteria andDtAddressGreaterThanOrEqualTo(String value) {
            addCriterion("dt_address >=", value, "dtAddress");
            return (Criteria) this;
        }

        public Criteria andDtAddressLessThan(String value) {
            addCriterion("dt_address <", value, "dtAddress");
            return (Criteria) this;
        }

        public Criteria andDtAddressLessThanOrEqualTo(String value) {
            addCriterion("dt_address <=", value, "dtAddress");
            return (Criteria) this;
        }

        public Criteria andDtAddressLike(String value) {
            addCriterion("dt_address like", value, "dtAddress");
            return (Criteria) this;
        }

        public Criteria andDtAddressNotLike(String value) {
            addCriterion("dt_address not like", value, "dtAddress");
            return (Criteria) this;
        }

        public Criteria andDtAddressIn(List<String> values) {
            addCriterion("dt_address in", values, "dtAddress");
            return (Criteria) this;
        }

        public Criteria andDtAddressNotIn(List<String> values) {
            addCriterion("dt_address not in", values, "dtAddress");
            return (Criteria) this;
        }

        public Criteria andDtAddressBetween(String value1, String value2) {
            addCriterion("dt_address between", value1, value2, "dtAddress");
            return (Criteria) this;
        }

        public Criteria andDtAddressNotBetween(String value1, String value2) {
            addCriterion("dt_address not between", value1, value2, "dtAddress");
            return (Criteria) this;
        }

        public Criteria andDtLooknumIsNull() {
            addCriterion("dt_looknum is null");
            return (Criteria) this;
        }

        public Criteria andDtLooknumIsNotNull() {
            addCriterion("dt_looknum is not null");
            return (Criteria) this;
        }

        public Criteria andDtLooknumEqualTo(Integer value) {
            addCriterion("dt_looknum =", value, "dtLooknum");
            return (Criteria) this;
        }

        public Criteria andDtLooknumNotEqualTo(Integer value) {
            addCriterion("dt_looknum <>", value, "dtLooknum");
            return (Criteria) this;
        }

        public Criteria andDtLooknumGreaterThan(Integer value) {
            addCriterion("dt_looknum >", value, "dtLooknum");
            return (Criteria) this;
        }

        public Criteria andDtLooknumGreaterThanOrEqualTo(Integer value) {
            addCriterion("dt_looknum >=", value, "dtLooknum");
            return (Criteria) this;
        }

        public Criteria andDtLooknumLessThan(Integer value) {
            addCriterion("dt_looknum <", value, "dtLooknum");
            return (Criteria) this;
        }

        public Criteria andDtLooknumLessThanOrEqualTo(Integer value) {
            addCriterion("dt_looknum <=", value, "dtLooknum");
            return (Criteria) this;
        }

        public Criteria andDtLooknumIn(List<Integer> values) {
            addCriterion("dt_looknum in", values, "dtLooknum");
            return (Criteria) this;
        }

        public Criteria andDtLooknumNotIn(List<Integer> values) {
            addCriterion("dt_looknum not in", values, "dtLooknum");
            return (Criteria) this;
        }

        public Criteria andDtLooknumBetween(Integer value1, Integer value2) {
            addCriterion("dt_looknum between", value1, value2, "dtLooknum");
            return (Criteria) this;
        }

        public Criteria andDtLooknumNotBetween(Integer value1, Integer value2) {
            addCriterion("dt_looknum not between", value1, value2, "dtLooknum");
            return (Criteria) this;
        }

        public Criteria andDtLikenumIsNull() {
            addCriterion("dt_likenum is null");
            return (Criteria) this;
        }

        public Criteria andDtLikenumIsNotNull() {
            addCriterion("dt_likenum is not null");
            return (Criteria) this;
        }

        public Criteria andDtLikenumEqualTo(Integer value) {
            addCriterion("dt_likenum =", value, "dtLikenum");
            return (Criteria) this;
        }

        public Criteria andDtLikenumNotEqualTo(Integer value) {
            addCriterion("dt_likenum <>", value, "dtLikenum");
            return (Criteria) this;
        }

        public Criteria andDtLikenumGreaterThan(Integer value) {
            addCriterion("dt_likenum >", value, "dtLikenum");
            return (Criteria) this;
        }

        public Criteria andDtLikenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("dt_likenum >=", value, "dtLikenum");
            return (Criteria) this;
        }

        public Criteria andDtLikenumLessThan(Integer value) {
            addCriterion("dt_likenum <", value, "dtLikenum");
            return (Criteria) this;
        }

        public Criteria andDtLikenumLessThanOrEqualTo(Integer value) {
            addCriterion("dt_likenum <=", value, "dtLikenum");
            return (Criteria) this;
        }

        public Criteria andDtLikenumIn(List<Integer> values) {
            addCriterion("dt_likenum in", values, "dtLikenum");
            return (Criteria) this;
        }

        public Criteria andDtLikenumNotIn(List<Integer> values) {
            addCriterion("dt_likenum not in", values, "dtLikenum");
            return (Criteria) this;
        }

        public Criteria andDtLikenumBetween(Integer value1, Integer value2) {
            addCriterion("dt_likenum between", value1, value2, "dtLikenum");
            return (Criteria) this;
        }

        public Criteria andDtLikenumNotBetween(Integer value1, Integer value2) {
            addCriterion("dt_likenum not between", value1, value2, "dtLikenum");
            return (Criteria) this;
        }

        public Criteria andDtPinglunnumIsNull() {
            addCriterion("dt_pinglunnum is null");
            return (Criteria) this;
        }

        public Criteria andDtPinglunnumIsNotNull() {
            addCriterion("dt_pinglunnum is not null");
            return (Criteria) this;
        }

        public Criteria andDtPinglunnumEqualTo(Integer value) {
            addCriterion("dt_pinglunnum =", value, "dtPinglunnum");
            return (Criteria) this;
        }

        public Criteria andDtPinglunnumNotEqualTo(Integer value) {
            addCriterion("dt_pinglunnum <>", value, "dtPinglunnum");
            return (Criteria) this;
        }

        public Criteria andDtPinglunnumGreaterThan(Integer value) {
            addCriterion("dt_pinglunnum >", value, "dtPinglunnum");
            return (Criteria) this;
        }

        public Criteria andDtPinglunnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("dt_pinglunnum >=", value, "dtPinglunnum");
            return (Criteria) this;
        }

        public Criteria andDtPinglunnumLessThan(Integer value) {
            addCriterion("dt_pinglunnum <", value, "dtPinglunnum");
            return (Criteria) this;
        }

        public Criteria andDtPinglunnumLessThanOrEqualTo(Integer value) {
            addCriterion("dt_pinglunnum <=", value, "dtPinglunnum");
            return (Criteria) this;
        }

        public Criteria andDtPinglunnumIn(List<Integer> values) {
            addCriterion("dt_pinglunnum in", values, "dtPinglunnum");
            return (Criteria) this;
        }

        public Criteria andDtPinglunnumNotIn(List<Integer> values) {
            addCriterion("dt_pinglunnum not in", values, "dtPinglunnum");
            return (Criteria) this;
        }

        public Criteria andDtPinglunnumBetween(Integer value1, Integer value2) {
            addCriterion("dt_pinglunnum between", value1, value2, "dtPinglunnum");
            return (Criteria) this;
        }

        public Criteria andDtPinglunnumNotBetween(Integer value1, Integer value2) {
            addCriterion("dt_pinglunnum not between", value1, value2, "dtPinglunnum");
            return (Criteria) this;
        }

        public Criteria andDtZhuanfanumIsNull() {
            addCriterion("dt_zhuanfanum is null");
            return (Criteria) this;
        }

        public Criteria andDtZhuanfanumIsNotNull() {
            addCriterion("dt_zhuanfanum is not null");
            return (Criteria) this;
        }

        public Criteria andDtZhuanfanumEqualTo(Integer value) {
            addCriterion("dt_zhuanfanum =", value, "dtZhuanfanum");
            return (Criteria) this;
        }

        public Criteria andDtZhuanfanumNotEqualTo(Integer value) {
            addCriterion("dt_zhuanfanum <>", value, "dtZhuanfanum");
            return (Criteria) this;
        }

        public Criteria andDtZhuanfanumGreaterThan(Integer value) {
            addCriterion("dt_zhuanfanum >", value, "dtZhuanfanum");
            return (Criteria) this;
        }

        public Criteria andDtZhuanfanumGreaterThanOrEqualTo(Integer value) {
            addCriterion("dt_zhuanfanum >=", value, "dtZhuanfanum");
            return (Criteria) this;
        }

        public Criteria andDtZhuanfanumLessThan(Integer value) {
            addCriterion("dt_zhuanfanum <", value, "dtZhuanfanum");
            return (Criteria) this;
        }

        public Criteria andDtZhuanfanumLessThanOrEqualTo(Integer value) {
            addCriterion("dt_zhuanfanum <=", value, "dtZhuanfanum");
            return (Criteria) this;
        }

        public Criteria andDtZhuanfanumIn(List<Integer> values) {
            addCriterion("dt_zhuanfanum in", values, "dtZhuanfanum");
            return (Criteria) this;
        }

        public Criteria andDtZhuanfanumNotIn(List<Integer> values) {
            addCriterion("dt_zhuanfanum not in", values, "dtZhuanfanum");
            return (Criteria) this;
        }

        public Criteria andDtZhuanfanumBetween(Integer value1, Integer value2) {
            addCriterion("dt_zhuanfanum between", value1, value2, "dtZhuanfanum");
            return (Criteria) this;
        }

        public Criteria andDtZhuanfanumNotBetween(Integer value1, Integer value2) {
            addCriterion("dt_zhuanfanum not between", value1, value2, "dtZhuanfanum");
            return (Criteria) this;
        }

        public Criteria andDtTimeIsNull() {
            addCriterion("dt_time is null");
            return (Criteria) this;
        }

        public Criteria andDtTimeIsNotNull() {
            addCriterion("dt_time is not null");
            return (Criteria) this;
        }

        public Criteria andDtTimeEqualTo(Date value) {
            addCriterionForJDBCDate("dt_time =", value, "dtTime");
            return (Criteria) this;
        }

        public Criteria andDtTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("dt_time <>", value, "dtTime");
            return (Criteria) this;
        }

        public Criteria andDtTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("dt_time >", value, "dtTime");
            return (Criteria) this;
        }

        public Criteria andDtTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("dt_time >=", value, "dtTime");
            return (Criteria) this;
        }

        public Criteria andDtTimeLessThan(Date value) {
            addCriterionForJDBCDate("dt_time <", value, "dtTime");
            return (Criteria) this;
        }

        public Criteria andDtTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("dt_time <=", value, "dtTime");
            return (Criteria) this;
        }

        public Criteria andDtTimeIn(List<Date> values) {
            addCriterionForJDBCDate("dt_time in", values, "dtTime");
            return (Criteria) this;
        }

        public Criteria andDtTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("dt_time not in", values, "dtTime");
            return (Criteria) this;
        }

        public Criteria andDtTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("dt_time between", value1, value2, "dtTime");
            return (Criteria) this;
        }

        public Criteria andDtTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("dt_time not between", value1, value2, "dtTime");
            return (Criteria) this;
        }

        public Criteria andDtShcnumIsNull() {
            addCriterion("dt_shcnum is null");
            return (Criteria) this;
        }

        public Criteria andDtShcnumIsNotNull() {
            addCriterion("dt_shcnum is not null");
            return (Criteria) this;
        }

        public Criteria andDtShcnumEqualTo(Integer value) {
            addCriterion("dt_shcnum =", value, "dtShcnum");
            return (Criteria) this;
        }

        public Criteria andDtShcnumNotEqualTo(Integer value) {
            addCriterion("dt_shcnum <>", value, "dtShcnum");
            return (Criteria) this;
        }

        public Criteria andDtShcnumGreaterThan(Integer value) {
            addCriterion("dt_shcnum >", value, "dtShcnum");
            return (Criteria) this;
        }

        public Criteria andDtShcnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("dt_shcnum >=", value, "dtShcnum");
            return (Criteria) this;
        }

        public Criteria andDtShcnumLessThan(Integer value) {
            addCriterion("dt_shcnum <", value, "dtShcnum");
            return (Criteria) this;
        }

        public Criteria andDtShcnumLessThanOrEqualTo(Integer value) {
            addCriterion("dt_shcnum <=", value, "dtShcnum");
            return (Criteria) this;
        }

        public Criteria andDtShcnumIn(List<Integer> values) {
            addCriterion("dt_shcnum in", values, "dtShcnum");
            return (Criteria) this;
        }

        public Criteria andDtShcnumNotIn(List<Integer> values) {
            addCriterion("dt_shcnum not in", values, "dtShcnum");
            return (Criteria) this;
        }

        public Criteria andDtShcnumBetween(Integer value1, Integer value2) {
            addCriterion("dt_shcnum between", value1, value2, "dtShcnum");
            return (Criteria) this;
        }

        public Criteria andDtShcnumNotBetween(Integer value1, Integer value2) {
            addCriterion("dt_shcnum not between", value1, value2, "dtShcnum");
            return (Criteria) this;
        }

        public Criteria andDtRoleIsNull() {
            addCriterion("dt_role is null");
            return (Criteria) this;
        }

        public Criteria andDtRoleIsNotNull() {
            addCriterion("dt_role is not null");
            return (Criteria) this;
        }

        public Criteria andDtRoleEqualTo(Integer value) {
            addCriterion("dt_role =", value, "dtRole");
            return (Criteria) this;
        }

        public Criteria andDtRoleNotEqualTo(Integer value) {
            addCriterion("dt_role <>", value, "dtRole");
            return (Criteria) this;
        }

        public Criteria andDtRoleGreaterThan(Integer value) {
            addCriterion("dt_role >", value, "dtRole");
            return (Criteria) this;
        }

        public Criteria andDtRoleGreaterThanOrEqualTo(Integer value) {
            addCriterion("dt_role >=", value, "dtRole");
            return (Criteria) this;
        }

        public Criteria andDtRoleLessThan(Integer value) {
            addCriterion("dt_role <", value, "dtRole");
            return (Criteria) this;
        }

        public Criteria andDtRoleLessThanOrEqualTo(Integer value) {
            addCriterion("dt_role <=", value, "dtRole");
            return (Criteria) this;
        }

        public Criteria andDtRoleIn(List<Integer> values) {
            addCriterion("dt_role in", values, "dtRole");
            return (Criteria) this;
        }

        public Criteria andDtRoleNotIn(List<Integer> values) {
            addCriterion("dt_role not in", values, "dtRole");
            return (Criteria) this;
        }

        public Criteria andDtRoleBetween(Integer value1, Integer value2) {
            addCriterion("dt_role between", value1, value2, "dtRole");
            return (Criteria) this;
        }

        public Criteria andDtRoleNotBetween(Integer value1, Integer value2) {
            addCriterion("dt_role not between", value1, value2, "dtRole");
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