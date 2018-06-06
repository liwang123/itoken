package com.thingtrust.token.domain.example;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *  查询条件example类
 * @author wang yu
 * @date 2018-06-05
 */
public class TokenExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TokenExample() {
        oredCriteria = new ArrayList<>();
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setOrderByClause(final String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public void setDistinct(final boolean distinct) {
        this.distinct = distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(final Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        final Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        final Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        final Criteria criteria = new Criteria();
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
            criteria = new ArrayList<>();
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

        protected void addCriterion(final String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(final String condition, final Object value, final String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(final String condition, final Object value1, final Object value2, final String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

	        public Criteria andIdIsNull() {
                addCriterion("id is null");
            return (Criteria)this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria)this;
        }

        public Criteria andIdEqualTo(final Long value) {
            addCriterion("id =", value, "id");
            return (Criteria)this;
        }

        public Criteria andIdNotEqualTo(final Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria)this;
        }

        public Criteria andIdIn(final List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria)this;
        }

        public Criteria andIdNotIn(final List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria)this;
        }

        public Criteria andIdBetween(final Long value1, final Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria)this;
        }

        public Criteria andIdNotBetween(final Long value1, final Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria)this;
        }

        public Criteria andIdGreaterThan(final Long value) {
            addCriterion("id >", value, "id");
            return (Criteria)this;
        }

        public Criteria andIdGreaterThanOrEqualTo(final Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria)this;
        }

        public Criteria andIdLessThan(final Long value) {
            addCriterion("id <", value, "id");
            return (Criteria)this;
        }

        public Criteria andIdLessThanOrEqualTo(final Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria)this;
        }

        public Criteria andAssetNameIsNull() {
            addCriterion("asset_name is null");
            return (Criteria)this;
        }

        public Criteria andAssetNameIsNotNull() {
            addCriterion("asset_name is not null");
            return (Criteria)this;
        }

        public Criteria andAssetNameEqualTo(final String value) {
            addCriterion("asset_name =", value, "assetName");
            return (Criteria)this;
        }

        public Criteria andAssetNameNotEqualTo(final String value) {
            addCriterion("asset_name <>", value, "assetName");
            return (Criteria)this;
        }

        public Criteria andAssetNameIn(final List<String> values) {
            addCriterion("asset_name in", values, "assetName");
            return (Criteria)this;
        }

        public Criteria andAssetNameNotIn(final List<String> values) {
            addCriterion("asset_name not in", values, "assetName");
            return (Criteria)this;
        }

        public Criteria andAssetNameBetween(final String value1, final String value2) {
            addCriterion("asset_name between", value1, value2, "assetName");
            return (Criteria)this;
        }

        public Criteria andAssetNameNotBetween(final String value1, final String value2) {
            addCriterion("asset_name not between", value1, value2, "assetName");
            return (Criteria)this;
        }


        public Criteria andAssetNameLike(final String value) {
            addCriterion("asset_name like", value, "assetName");
            return (Criteria)this;
        }

        public Criteria andAssetNameNotLike(final String value) {
            addCriterion("asset_name not like", value, "assetName");
            return (Criteria)this;
        }
			        public Criteria andTickerIsNull() {
                        addCriterion("ticker is null");
            return (Criteria)this;
        }

        public Criteria andTickerIsNotNull() {
            addCriterion("ticker is not null");
            return (Criteria)this;
        }

        public Criteria andTickerEqualTo(final String value) {
            addCriterion("ticker =", value, "ticker");
            return (Criteria)this;
        }

        public Criteria andTickerNotEqualTo(final String value) {
            addCriterion("ticker <>", value, "ticker");
            return (Criteria)this;
        }

        public Criteria andTickerIn(final List<String> values) {
            addCriterion("ticker in", values, "ticker");
            return (Criteria)this;
        }

        public Criteria andTickerNotIn(final List<String> values) {
            addCriterion("ticker not in", values, "ticker");
            return (Criteria)this;
        }

        public Criteria andTickerBetween(final String value1, final String value2) {
            addCriterion("ticker between", value1, value2, "ticker");
            return (Criteria)this;
        }

        public Criteria andTickerNotBetween(final String value1, final String value2) {
            addCriterion("ticker not between", value1, value2, "ticker");
            return (Criteria)this;
        }


        public Criteria andTickerLike(final String value) {
            addCriterion("ticker like", value, "ticker");
            return (Criteria)this;
        }

        public Criteria andTickerNotLike(final String value) {
            addCriterion("ticker not like", value, "ticker");
            return (Criteria)this;
        }
			        public Criteria andCapIsNull() {
                        addCriterion("cap is null");
            return (Criteria)this;
        }

        public Criteria andCapIsNotNull() {
            addCriterion("cap is not null");
            return (Criteria)this;
        }

        public Criteria andCapEqualTo(final Long value) {
            addCriterion("cap =", value, "cap");
            return (Criteria)this;
        }

        public Criteria andCapNotEqualTo(final Long value) {
            addCriterion("cap <>", value, "cap");
            return (Criteria)this;
        }

        public Criteria andCapIn(final List<Long> values) {
            addCriterion("cap in", values, "cap");
            return (Criteria)this;
        }

        public Criteria andCapNotIn(final List<Long> values) {
            addCriterion("cap not in", values, "cap");
            return (Criteria)this;
        }

        public Criteria andCapBetween(final Long value1, final Long value2) {
            addCriterion("cap between", value1, value2, "cap");
            return (Criteria)this;
        }

        public Criteria andCapNotBetween(final Long value1, final Long value2) {
            addCriterion("cap not between", value1, value2, "cap");
            return (Criteria)this;
        }

        public Criteria andCapGreaterThan(final Long value) {
            addCriterion("cap >", value, "cap");
            return (Criteria)this;
        }

        public Criteria andCapGreaterThanOrEqualTo(final Long value) {
            addCriterion("cap >=", value, "cap");
            return (Criteria)this;
        }

        public Criteria andCapLessThan(final Long value) {
            addCriterion("cap <", value, "cap");
            return (Criteria)this;
        }

        public Criteria andCapLessThanOrEqualTo(final Long value) {
            addCriterion("cap <=", value, "cap");
            return (Criteria)this;
        }

        public Criteria andAssetIdIsNull() {
            addCriterion("asset_id is null");
            return (Criteria)this;
        }

        public Criteria andAssetIdIsNotNull() {
            addCriterion("asset_id is not null");
            return (Criteria)this;
        }

        public Criteria andAssetIdEqualTo(final String value) {
            addCriterion("asset_id =", value, "assetId");
            return (Criteria)this;
        }

        public Criteria andAssetIdNotEqualTo(final String value) {
            addCriterion("asset_id <>", value, "assetId");
            return (Criteria)this;
        }

        public Criteria andAssetIdIn(final List<String> values) {
            addCriterion("asset_id in", values, "assetId");
            return (Criteria)this;
        }

        public Criteria andAssetIdNotIn(final List<String> values) {
            addCriterion("asset_id not in", values, "assetId");
            return (Criteria)this;
        }

        public Criteria andAssetIdBetween(final String value1, final String value2) {
            addCriterion("asset_id between", value1, value2, "assetId");
            return (Criteria)this;
        }

        public Criteria andAssetIdNotBetween(final String value1, final String value2) {
            addCriterion("asset_id not between", value1, value2, "assetId");
            return (Criteria)this;
        }


        public Criteria andAssetIdLike(final String value) {
            addCriterion("asset_id like", value, "assetId");
            return (Criteria)this;
        }

        public Criteria andAssetIdNotLike(final String value) {
            addCriterion("asset_id not like", value, "assetId");
            return (Criteria)this;
        }
			        public Criteria andIssuserNameIsNull() {
                        addCriterion("issuser_name is null");
            return (Criteria)this;
        }

        public Criteria andIssuserNameIsNotNull() {
            addCriterion("issuser_name is not null");
            return (Criteria)this;
        }

        public Criteria andIssuserNameEqualTo(final String value) {
            addCriterion("issuser_name =", value, "issuserName");
            return (Criteria)this;
        }

        public Criteria andIssuserNameNotEqualTo(final String value) {
            addCriterion("issuser_name <>", value, "issuserName");
            return (Criteria)this;
        }

        public Criteria andIssuserNameIn(final List<String> values) {
            addCriterion("issuser_name in", values, "issuserName");
            return (Criteria)this;
        }

        public Criteria andIssuserNameNotIn(final List<String> values) {
            addCriterion("issuser_name not in", values, "issuserName");
            return (Criteria)this;
        }

        public Criteria andIssuserNameBetween(final String value1, final String value2) {
            addCriterion("issuser_name between", value1, value2, "issuserName");
            return (Criteria)this;
        }

        public Criteria andIssuserNameNotBetween(final String value1, final String value2) {
            addCriterion("issuser_name not between", value1, value2, "issuserName");
            return (Criteria)this;
        }


        public Criteria andIssuserNameLike(final String value) {
            addCriterion("issuser_name like", value, "issuserName");
            return (Criteria)this;
        }

        public Criteria andIssuserNameNotLike(final String value) {
            addCriterion("issuser_name not like", value, "issuserName");
            return (Criteria)this;
        }
			        public Criteria andAddressIsNull() {
                        addCriterion("address is null");
            return (Criteria)this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria)this;
        }

        public Criteria andAddressEqualTo(final String value) {
            addCriterion("address =", value, "address");
            return (Criteria)this;
        }

        public Criteria andAddressNotEqualTo(final String value) {
            addCriterion("address <>", value, "address");
            return (Criteria)this;
        }

        public Criteria andAddressIn(final List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria)this;
        }

        public Criteria andAddressNotIn(final List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria)this;
        }

        public Criteria andAddressBetween(final String value1, final String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria)this;
        }

        public Criteria andAddressNotBetween(final String value1, final String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria)this;
        }


        public Criteria andAddressLike(final String value) {
            addCriterion("address like", value, "address");
            return (Criteria)this;
        }

        public Criteria andAddressNotLike(final String value) {
            addCriterion("address not like", value, "address");
            return (Criteria)this;
        }
			        public Criteria andReviewStatusIsNull() {
                        addCriterion("review_status is null");
            return (Criteria)this;
        }

        public Criteria andReviewStatusIsNotNull() {
            addCriterion("review_status is not null");
            return (Criteria)this;
        }

        public Criteria andReviewStatusEqualTo(final Integer value) {
            addCriterion("review_status =", value, "reviewStatus");
            return (Criteria)this;
        }

        public Criteria andReviewStatusNotEqualTo(final Integer value) {
            addCriterion("review_status <>", value, "reviewStatus");
            return (Criteria)this;
        }

        public Criteria andReviewStatusIn(final List<Integer> values) {
            addCriterion("review_status in", values, "reviewStatus");
            return (Criteria)this;
        }

        public Criteria andReviewStatusNotIn(final List<Integer> values) {
            addCriterion("review_status not in", values, "reviewStatus");
            return (Criteria)this;
        }

        public Criteria andReviewStatusBetween(final Integer value1, final Integer value2) {
            addCriterion("review_status between", value1, value2, "reviewStatus");
            return (Criteria)this;
        }

        public Criteria andReviewStatusNotBetween(final Integer value1, final Integer value2) {
            addCriterion("review_status not between", value1, value2, "reviewStatus");
            return (Criteria)this;
        }

        public Criteria andReviewStatusGreaterThan(final Integer value) {
            addCriterion("review_status >", value, "reviewStatus");
            return (Criteria)this;
        }

        public Criteria andReviewStatusGreaterThanOrEqualTo(final Integer value) {
            addCriterion("review_status >=", value, "reviewStatus");
            return (Criteria)this;
        }

        public Criteria andReviewStatusLessThan(final Integer value) {
            addCriterion("review_status <", value, "reviewStatus");
            return (Criteria)this;
        }

        public Criteria andReviewStatusLessThanOrEqualTo(final Integer value) {
            addCriterion("review_status <=", value, "reviewStatus");
            return (Criteria)this;
        }

        public Criteria andPayStatusIsNull() {
            addCriterion("pay_status is null");
            return (Criteria)this;
        }

        public Criteria andPayStatusIsNotNull() {
            addCriterion("pay_status is not null");
            return (Criteria)this;
        }

        public Criteria andPayStatusEqualTo(final Integer value) {
            addCriterion("pay_status =", value, "payStatus");
            return (Criteria)this;
        }

        public Criteria andPayStatusNotEqualTo(final Integer value) {
            addCriterion("pay_status <>", value, "payStatus");
            return (Criteria)this;
        }

        public Criteria andPayStatusIn(final List<Integer> values) {
            addCriterion("pay_status in", values, "payStatus");
            return (Criteria)this;
        }

        public Criteria andPayStatusNotIn(final List<Integer> values) {
            addCriterion("pay_status not in", values, "payStatus");
            return (Criteria)this;
        }

        public Criteria andPayStatusBetween(final Integer value1, final Integer value2) {
            addCriterion("pay_status between", value1, value2, "payStatus");
            return (Criteria)this;
        }

        public Criteria andPayStatusNotBetween(final Integer value1, final Integer value2) {
            addCriterion("pay_status not between", value1, value2, "payStatus");
            return (Criteria)this;
        }

        public Criteria andPayStatusGreaterThan(final Integer value) {
            addCriterion("pay_status >", value, "payStatus");
            return (Criteria)this;
        }

        public Criteria andPayStatusGreaterThanOrEqualTo(final Integer value) {
            addCriterion("pay_status >=", value, "payStatus");
            return (Criteria)this;
        }

        public Criteria andPayStatusLessThan(final Integer value) {
            addCriterion("pay_status <", value, "payStatus");
            return (Criteria)this;
        }

        public Criteria andPayStatusLessThanOrEqualTo(final Integer value) {
            addCriterion("pay_status <=", value, "payStatus");
            return (Criteria)this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria)this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria)this;
        }

        public Criteria andEmailEqualTo(final String value) {
            addCriterion("email =", value, "email");
            return (Criteria)this;
        }

        public Criteria andEmailNotEqualTo(final String value) {
            addCriterion("email <>", value, "email");
            return (Criteria)this;
        }

        public Criteria andEmailIn(final List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria)this;
        }

        public Criteria andEmailNotIn(final List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria)this;
        }

        public Criteria andEmailBetween(final String value1, final String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria)this;
        }

        public Criteria andEmailNotBetween(final String value1, final String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria)this;
        }


        public Criteria andEmailLike(final String value) {
            addCriterion("email like", value, "email");
            return (Criteria)this;
        }

        public Criteria andEmailNotLike(final String value) {
            addCriterion("email not like", value, "email");
            return (Criteria)this;
        }
			        public Criteria andDescriptIsNull() {
                        addCriterion("descript is null");
            return (Criteria)this;
        }

        public Criteria andDescriptIsNotNull() {
            addCriterion("descript is not null");
            return (Criteria)this;
        }

        public Criteria andDescriptEqualTo(final String value) {
            addCriterion("descript =", value, "descript");
            return (Criteria)this;
        }

        public Criteria andDescriptNotEqualTo(final String value) {
            addCriterion("descript <>", value, "descript");
            return (Criteria)this;
        }

        public Criteria andDescriptIn(final List<String> values) {
            addCriterion("descript in", values, "descript");
            return (Criteria)this;
        }

        public Criteria andDescriptNotIn(final List<String> values) {
            addCriterion("descript not in", values, "descript");
            return (Criteria)this;
        }

        public Criteria andDescriptBetween(final String value1, final String value2) {
            addCriterion("descript between", value1, value2, "descript");
            return (Criteria)this;
        }

        public Criteria andDescriptNotBetween(final String value1, final String value2) {
            addCriterion("descript not between", value1, value2, "descript");
            return (Criteria)this;
        }


        public Criteria andDescriptLike(final String value) {
            addCriterion("descript like", value, "descript");
            return (Criteria)this;
        }

        public Criteria andDescriptNotLike(final String value) {
            addCriterion("descript not like", value, "descript");
            return (Criteria)this;
        }
			        public Criteria andOperatorIsNull() {
                        addCriterion("operator is null");
            return (Criteria)this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("operator is not null");
            return (Criteria)this;
        }

        public Criteria andOperatorEqualTo(final Integer value) {
            addCriterion("operator =", value, "operator");
            return (Criteria)this;
        }

        public Criteria andOperatorNotEqualTo(final Integer value) {
            addCriterion("operator <>", value, "operator");
            return (Criteria)this;
        }

        public Criteria andOperatorIn(final List<Integer> values) {
            addCriterion("operator in", values, "operator");
            return (Criteria)this;
        }

        public Criteria andOperatorNotIn(final List<Integer> values) {
            addCriterion("operator not in", values, "operator");
            return (Criteria)this;
        }

        public Criteria andOperatorBetween(final Integer value1, final Integer value2) {
            addCriterion("operator between", value1, value2, "operator");
            return (Criteria)this;
        }

        public Criteria andOperatorNotBetween(final Integer value1, final Integer value2) {
            addCriterion("operator not between", value1, value2, "operator");
            return (Criteria)this;
        }

        public Criteria andOperatorGreaterThan(final Integer value) {
            addCriterion("operator >", value, "operator");
            return (Criteria)this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(final Integer value) {
            addCriterion("operator >=", value, "operator");
            return (Criteria)this;
        }

        public Criteria andOperatorLessThan(final Integer value) {
            addCriterion("operator <", value, "operator");
            return (Criteria)this;
        }

        public Criteria andOperatorLessThanOrEqualTo(final Integer value) {
            addCriterion("operator <=", value, "operator");
            return (Criteria)this;
        }

        public Criteria andCrtTimeIsNull() {
            addCriterion("crt_time is null");
            return (Criteria)this;
        }

        public Criteria andCrtTimeIsNotNull() {
            addCriterion("crt_time is not null");
            return (Criteria)this;
        }

        public Criteria andCrtTimeEqualTo(final LocalDateTime value) {
            addCriterion("crt_time =", value, "crtTime");
            return (Criteria)this;
        }

        public Criteria andCrtTimeNotEqualTo(final LocalDateTime value) {
            addCriterion("crt_time <>", value, "crtTime");
            return (Criteria)this;
        }

        public Criteria andCrtTimeIn(final List<LocalDateTime> values) {
            addCriterion("crt_time in", values, "crtTime");
            return (Criteria)this;
        }

        public Criteria andCrtTimeNotIn(final List<LocalDateTime> values) {
            addCriterion("crt_time not in", values, "crtTime");
            return (Criteria)this;
        }

        public Criteria andCrtTimeBetween(final LocalDateTime value1, final LocalDateTime value2) {
            addCriterion("crt_time between", value1, value2, "crtTime");
            return (Criteria)this;
        }

        public Criteria andCrtTimeNotBetween(final LocalDateTime value1, final LocalDateTime value2) {
            addCriterion("crt_time not between", value1, value2, "crtTime");
            return (Criteria)this;
        }

        public Criteria andCrtTimeGreaterThan(final LocalDateTime value) {
            addCriterion("crt_time >", value, "crtTime");
            return (Criteria)this;
        }

        public Criteria andCrtTimeGreaterThanOrEqualTo(final LocalDateTime value) {
            addCriterion("crt_time >=", value, "crtTime");
            return (Criteria)this;
        }

        public Criteria andCrtTimeLessThan(final LocalDateTime value) {
            addCriterion("crt_time <", value, "crtTime");
            return (Criteria)this;
        }

        public Criteria andCrtTimeLessThanOrEqualTo(final LocalDateTime value) {
            addCriterion("crt_time <=", value, "crtTime");
            return (Criteria)this;
        }

        public Criteria andOperatorTimeIsNull() {
            addCriterion("operator_time is null");
            return (Criteria)this;
        }

        public Criteria andOperatorTimeIsNotNull() {
            addCriterion("operator_time is not null");
            return (Criteria)this;
        }

        public Criteria andOperatorTimeEqualTo(final LocalDateTime value) {
            addCriterion("operator_time =", value, "operatorTime");
            return (Criteria)this;
        }

        public Criteria andOperatorTimeNotEqualTo(final LocalDateTime value) {
            addCriterion("operator_time <>", value, "operatorTime");
            return (Criteria)this;
        }

        public Criteria andOperatorTimeIn(final List<LocalDateTime> values) {
            addCriterion("operator_time in", values, "operatorTime");
            return (Criteria)this;
        }

        public Criteria andOperatorTimeNotIn(final List<LocalDateTime> values) {
            addCriterion("operator_time not in", values, "operatorTime");
            return (Criteria)this;
        }

        public Criteria andOperatorTimeBetween(final LocalDateTime value1, final LocalDateTime value2) {
            addCriterion("operator_time between", value1, value2, "operatorTime");
            return (Criteria)this;
        }

        public Criteria andOperatorTimeNotBetween(final LocalDateTime value1, final LocalDateTime value2) {
            addCriterion("operator_time not between", value1, value2, "operatorTime");
            return (Criteria)this;
        }

        public Criteria andOperatorTimeGreaterThan(final LocalDateTime value) {
            addCriterion("operator_time >", value, "operatorTime");
            return (Criteria)this;
        }

        public Criteria andOperatorTimeGreaterThanOrEqualTo(final LocalDateTime value) {
            addCriterion("operator_time >=", value, "operatorTime");
            return (Criteria)this;
        }

        public Criteria andOperatorTimeLessThan(final LocalDateTime value) {
            addCriterion("operator_time <", value, "operatorTime");
            return (Criteria)this;
        }

        public Criteria andOperatorTimeLessThanOrEqualTo(final LocalDateTime value) {
            addCriterion("operator_time <=", value, "operatorTime");
            return (Criteria)this;
        }

        public Criteria andEmailIdIsNull() {
            addCriterion("email_id is null");
            return (Criteria)this;
        }

        public Criteria andEmailIdIsNotNull() {
            addCriterion("email_id is not null");
            return (Criteria)this;
        }

        public Criteria andEmailIdEqualTo(final Integer value) {
            addCriterion("email_id =", value, "emailId");
            return (Criteria)this;
        }

        public Criteria andEmailIdNotEqualTo(final Integer value) {
            addCriterion("email_id <>", value, "emailId");
            return (Criteria)this;
        }

        public Criteria andEmailIdIn(final List<Integer> values) {
            addCriterion("email_id in", values, "emailId");
            return (Criteria)this;
        }

        public Criteria andEmailIdNotIn(final List<Integer> values) {
            addCriterion("email_id not in", values, "emailId");
            return (Criteria)this;
        }

        public Criteria andEmailIdBetween(final Integer value1, final Integer value2) {
            addCriterion("email_id between", value1, value2, "emailId");
            return (Criteria)this;
        }

        public Criteria andEmailIdNotBetween(final Integer value1, final Integer value2) {
            addCriterion("email_id not between", value1, value2, "emailId");
            return (Criteria)this;
        }

        public Criteria andEmailIdGreaterThan(final Integer value) {
            addCriterion("email_id >", value, "emailId");
            return (Criteria)this;
        }

        public Criteria andEmailIdGreaterThanOrEqualTo(final Integer value) {
            addCriterion("email_id >=", value, "emailId");
            return (Criteria)this;
        }

        public Criteria andEmailIdLessThan(final Integer value) {
            addCriterion("email_id <", value, "emailId");
            return (Criteria)this;
        }

        public Criteria andEmailIdLessThanOrEqualTo(final Integer value) {
            addCriterion("email_id <=", value, "emailId");
            return (Criteria)this;
        }

        public Criteria andTokencolIsNull() {
            addCriterion("tokencol is null");
            return (Criteria)this;
        }

        public Criteria andTokencolIsNotNull() {
            addCriterion("tokencol is not null");
            return (Criteria)this;
        }

        public Criteria andTokencolEqualTo(final String value) {
            addCriterion("tokencol =", value, "tokencol");
            return (Criteria)this;
        }

        public Criteria andTokencolNotEqualTo(final String value) {
            addCriterion("tokencol <>", value, "tokencol");
            return (Criteria)this;
        }

        public Criteria andTokencolIn(final List<String> values) {
            addCriterion("tokencol in", values, "tokencol");
            return (Criteria)this;
        }

        public Criteria andTokencolNotIn(final List<String> values) {
            addCriterion("tokencol not in", values, "tokencol");
            return (Criteria)this;
        }

        public Criteria andTokencolBetween(final String value1, final String value2) {
            addCriterion("tokencol between", value1, value2, "tokencol");
            return (Criteria)this;
        }

        public Criteria andTokencolNotBetween(final String value1, final String value2) {
            addCriterion("tokencol not between", value1, value2, "tokencol");
            return (Criteria)this;
        }


        public Criteria andTokencolLike(final String value) {
            addCriterion("tokencol like", value, "tokencol");
            return (Criteria)this;
        }

        public Criteria andTokencolNotLike(final String value) {
            addCriterion("tokencol not like", value, "tokencol");
            return (Criteria)this;
        }
			        public Criteria andTokencol1IsNull() {
                        addCriterion("tokencol1 is null");
            return (Criteria)this;
        }

        public Criteria andTokencol1IsNotNull() {
            addCriterion("tokencol1 is not null");
            return (Criteria)this;
        }

        public Criteria andTokencol1EqualTo(final String value) {
            addCriterion("tokencol1 =", value, "tokencol1");
            return (Criteria)this;
        }

        public Criteria andTokencol1NotEqualTo(final String value) {
            addCriterion("tokencol1 <>", value, "tokencol1");
            return (Criteria)this;
        }

        public Criteria andTokencol1In(final List<String> values) {
            addCriterion("tokencol1 in", values, "tokencol1");
            return (Criteria)this;
        }

        public Criteria andTokencol1NotIn(final List<String> values) {
            addCriterion("tokencol1 not in", values, "tokencol1");
            return (Criteria)this;
        }

        public Criteria andTokencol1Between(final String value1, final String value2) {
            addCriterion("tokencol1 between", value1, value2, "tokencol1");
            return (Criteria)this;
        }

        public Criteria andTokencol1NotBetween(final String value1, final String value2) {
            addCriterion("tokencol1 not between", value1, value2, "tokencol1");
            return (Criteria)this;
        }


        public Criteria andTokencol1Like(final String value) {
            addCriterion("tokencol1 like", value, "tokencol1");
            return (Criteria)this;
        }

        public Criteria andTokencol1NotLike(final String value) {
            addCriterion("tokencol1 not like", value, "tokencol1");
            return (Criteria)this;
        }
			    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }

        public Criteria andFieldLike(final String fieldName, final String keyword) {
            addCriterion(fieldName + " like ", keyword, fieldName);
            return this;
        }
    }

    public static class Criterion {
        private final String condition;
        private final String typeHandler;
        private Object value;
        private Object secondValue;
        private boolean noValue;
        private boolean singleValue;
        private boolean betweenValue;
        private boolean listValue;

        protected Criterion(final String condition) {
            super();
            this.condition = condition;
            typeHandler = null;
            noValue = true;
        }

        protected Criterion(final String condition, final Object value, final String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                listValue = true;
            } else {
                singleValue = true;
            }
        }

        protected Criterion(final String condition, final Object value) {
            this(condition, value, null);
        }

        protected Criterion(final String condition, final Object value, final Object secondValue, final String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            betweenValue = true;
        }

        protected Criterion(final String condition, final Object value, final Object secondValue) {
            this(condition, value, secondValue, null);
        }

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
    }
}
