package com.thingtrust.token.domain.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *  查询条件example类
 * @author wangyu
 * @date 2018-05-05
 */
public class TokenExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TokenExample() {
        oredCriteria = new ArrayList<>();
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

	        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria)this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria)this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria)this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria)this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria)this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria)this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria)this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria)this;
        }
		
				public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria)this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria)this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria)this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
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

        public Criteria andAssetNameEqualTo(String value) {
            addCriterion("asset_name =", value, "assetName");
            return (Criteria)this;
        }

        public Criteria andAssetNameNotEqualTo(String value) {
            addCriterion("asset_name <>", value, "assetName");
            return (Criteria)this;
        }

        public Criteria andAssetNameIn(List<String> values) {
            addCriterion("asset_name in", values, "assetName");
            return (Criteria)this;
        }

        public Criteria andAssetNameNotIn(List<String> values) {
            addCriterion("asset_name not in", values, "assetName");
            return (Criteria)this;
        }

        public Criteria andAssetNameBetween(String value1, String value2) {
            addCriterion("asset_name between", value1, value2, "assetName");
            return (Criteria)this;
        }

        public Criteria andAssetNameNotBetween(String value1, String value2) {
            addCriterion("asset_name not between", value1, value2, "assetName");
            return (Criteria)this;
        }
		
				
				public Criteria andAssetNameLike(String value) {
            addCriterion("asset_name like", value, "assetName");
            return (Criteria)this;
        }

        public Criteria andAssetNameNotLike(String value) {
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

        public Criteria andTickerEqualTo(String value) {
            addCriterion("ticker =", value, "ticker");
            return (Criteria)this;
        }

        public Criteria andTickerNotEqualTo(String value) {
            addCriterion("ticker <>", value, "ticker");
            return (Criteria)this;
        }

        public Criteria andTickerIn(List<String> values) {
            addCriterion("ticker in", values, "ticker");
            return (Criteria)this;
        }

        public Criteria andTickerNotIn(List<String> values) {
            addCriterion("ticker not in", values, "ticker");
            return (Criteria)this;
        }

        public Criteria andTickerBetween(String value1, String value2) {
            addCriterion("ticker between", value1, value2, "ticker");
            return (Criteria)this;
        }

        public Criteria andTickerNotBetween(String value1, String value2) {
            addCriterion("ticker not between", value1, value2, "ticker");
            return (Criteria)this;
        }
		
				
				public Criteria andTickerLike(String value) {
            addCriterion("ticker like", value, "ticker");
            return (Criteria)this;
        }

        public Criteria andTickerNotLike(String value) {
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

        public Criteria andCapEqualTo(Long value) {
            addCriterion("cap =", value, "cap");
            return (Criteria)this;
        }

        public Criteria andCapNotEqualTo(Long value) {
            addCriterion("cap <>", value, "cap");
            return (Criteria)this;
        }

        public Criteria andCapIn(List<Long> values) {
            addCriterion("cap in", values, "cap");
            return (Criteria)this;
        }

        public Criteria andCapNotIn(List<Long> values) {
            addCriterion("cap not in", values, "cap");
            return (Criteria)this;
        }

        public Criteria andCapBetween(Long value1, Long value2) {
            addCriterion("cap between", value1, value2, "cap");
            return (Criteria)this;
        }

        public Criteria andCapNotBetween(Long value1, Long value2) {
            addCriterion("cap not between", value1, value2, "cap");
            return (Criteria)this;
        }
		
				public Criteria andCapGreaterThan(Long value) {
            addCriterion("cap >", value, "cap");
            return (Criteria)this;
        }

        public Criteria andCapGreaterThanOrEqualTo(Long value) {
            addCriterion("cap >=", value, "cap");
            return (Criteria)this;
        }

        public Criteria andCapLessThan(Long value) {
            addCriterion("cap <", value, "cap");
            return (Criteria)this;
        }

        public Criteria andCapLessThanOrEqualTo(Long value) {
            addCriterion("cap <=", value, "cap");
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

        public Criteria andIssuserNameEqualTo(String value) {
            addCriterion("issuser_name =", value, "issuserName");
            return (Criteria)this;
        }

        public Criteria andIssuserNameNotEqualTo(String value) {
            addCriterion("issuser_name <>", value, "issuserName");
            return (Criteria)this;
        }

        public Criteria andIssuserNameIn(List<String> values) {
            addCriterion("issuser_name in", values, "issuserName");
            return (Criteria)this;
        }

        public Criteria andIssuserNameNotIn(List<String> values) {
            addCriterion("issuser_name not in", values, "issuserName");
            return (Criteria)this;
        }

        public Criteria andIssuserNameBetween(String value1, String value2) {
            addCriterion("issuser_name between", value1, value2, "issuserName");
            return (Criteria)this;
        }

        public Criteria andIssuserNameNotBetween(String value1, String value2) {
            addCriterion("issuser_name not between", value1, value2, "issuserName");
            return (Criteria)this;
        }
		
				
				public Criteria andIssuserNameLike(String value) {
            addCriterion("issuser_name like", value, "issuserName");
            return (Criteria)this;
        }

        public Criteria andIssuserNameNotLike(String value) {
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

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria)this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria)this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria)this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria)this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria)this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria)this;
        }
		
				
				public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria)this;
        }

        public Criteria andAddressNotLike(String value) {
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

        public Criteria andReviewStatusEqualTo(Integer value) {
            addCriterion("review_status =", value, "reviewStatus");
            return (Criteria)this;
        }

        public Criteria andReviewStatusNotEqualTo(Integer value) {
            addCriterion("review_status <>", value, "reviewStatus");
            return (Criteria)this;
        }

        public Criteria andReviewStatusIn(List<Integer> values) {
            addCriterion("review_status in", values, "reviewStatus");
            return (Criteria)this;
        }

        public Criteria andReviewStatusNotIn(List<Integer> values) {
            addCriterion("review_status not in", values, "reviewStatus");
            return (Criteria)this;
        }

        public Criteria andReviewStatusBetween(Integer value1, Integer value2) {
            addCriterion("review_status between", value1, value2, "reviewStatus");
            return (Criteria)this;
        }

        public Criteria andReviewStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("review_status not between", value1, value2, "reviewStatus");
            return (Criteria)this;
        }
		
				public Criteria andReviewStatusGreaterThan(Integer value) {
            addCriterion("review_status >", value, "reviewStatus");
            return (Criteria)this;
        }

        public Criteria andReviewStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("review_status >=", value, "reviewStatus");
            return (Criteria)this;
        }

        public Criteria andReviewStatusLessThan(Integer value) {
            addCriterion("review_status <", value, "reviewStatus");
            return (Criteria)this;
        }

        public Criteria andReviewStatusLessThanOrEqualTo(Integer value) {
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

        public Criteria andPayStatusEqualTo(Integer value) {
            addCriterion("pay_status =", value, "payStatus");
            return (Criteria)this;
        }

        public Criteria andPayStatusNotEqualTo(Integer value) {
            addCriterion("pay_status <>", value, "payStatus");
            return (Criteria)this;
        }

        public Criteria andPayStatusIn(List<Integer> values) {
            addCriterion("pay_status in", values, "payStatus");
            return (Criteria)this;
        }

        public Criteria andPayStatusNotIn(List<Integer> values) {
            addCriterion("pay_status not in", values, "payStatus");
            return (Criteria)this;
        }

        public Criteria andPayStatusBetween(Integer value1, Integer value2) {
            addCriterion("pay_status between", value1, value2, "payStatus");
            return (Criteria)this;
        }

        public Criteria andPayStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_status not between", value1, value2, "payStatus");
            return (Criteria)this;
        }
		
				public Criteria andPayStatusGreaterThan(Integer value) {
            addCriterion("pay_status >", value, "payStatus");
            return (Criteria)this;
        }

        public Criteria andPayStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_status >=", value, "payStatus");
            return (Criteria)this;
        }

        public Criteria andPayStatusLessThan(Integer value) {
            addCriterion("pay_status <", value, "payStatus");
            return (Criteria)this;
        }

        public Criteria andPayStatusLessThanOrEqualTo(Integer value) {
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

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria)this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria)this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria)this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria)this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria)this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria)this;
        }
		
				
				public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria)this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
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

        public Criteria andOperatorEqualTo(Integer value) {
            addCriterion("operator =", value, "operator");
            return (Criteria)this;
        }

        public Criteria andOperatorNotEqualTo(Integer value) {
            addCriterion("operator <>", value, "operator");
            return (Criteria)this;
        }

        public Criteria andOperatorIn(List<Integer> values) {
            addCriterion("operator in", values, "operator");
            return (Criteria)this;
        }

        public Criteria andOperatorNotIn(List<Integer> values) {
            addCriterion("operator not in", values, "operator");
            return (Criteria)this;
        }

        public Criteria andOperatorBetween(Integer value1, Integer value2) {
            addCriterion("operator between", value1, value2, "operator");
            return (Criteria)this;
        }

        public Criteria andOperatorNotBetween(Integer value1, Integer value2) {
            addCriterion("operator not between", value1, value2, "operator");
            return (Criteria)this;
        }
		
				public Criteria andOperatorGreaterThan(Integer value) {
            addCriterion("operator >", value, "operator");
            return (Criteria)this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(Integer value) {
            addCriterion("operator >=", value, "operator");
            return (Criteria)this;
        }

        public Criteria andOperatorLessThan(Integer value) {
            addCriterion("operator <", value, "operator");
            return (Criteria)this;
        }

        public Criteria andOperatorLessThanOrEqualTo(Integer value) {
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

        public Criteria andCrtTimeEqualTo(Date value) {
            addCriterion("crt_time =", value, "crtTime");
            return (Criteria)this;
        }

        public Criteria andCrtTimeNotEqualTo(Date value) {
            addCriterion("crt_time <>", value, "crtTime");
            return (Criteria)this;
        }

        public Criteria andCrtTimeIn(List<Date> values) {
            addCriterion("crt_time in", values, "crtTime");
            return (Criteria)this;
        }

        public Criteria andCrtTimeNotIn(List<Date> values) {
            addCriterion("crt_time not in", values, "crtTime");
            return (Criteria)this;
        }

        public Criteria andCrtTimeBetween(Date value1, Date value2) {
            addCriterion("crt_time between", value1, value2, "crtTime");
            return (Criteria)this;
        }

        public Criteria andCrtTimeNotBetween(Date value1, Date value2) {
            addCriterion("crt_time not between", value1, value2, "crtTime");
            return (Criteria)this;
        }
		
				public Criteria andCrtTimeGreaterThan(Date value) {
            addCriterion("crt_time >", value, "crtTime");
            return (Criteria)this;
        }

        public Criteria andCrtTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("crt_time >=", value, "crtTime");
            return (Criteria)this;
        }

        public Criteria andCrtTimeLessThan(Date value) {
            addCriterion("crt_time <", value, "crtTime");
            return (Criteria)this;
        }

        public Criteria andCrtTimeLessThanOrEqualTo(Date value) {
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

        public Criteria andOperatorTimeEqualTo(Date value) {
            addCriterion("operator_time =", value, "operatorTime");
            return (Criteria)this;
        }

        public Criteria andOperatorTimeNotEqualTo(Date value) {
            addCriterion("operator_time <>", value, "operatorTime");
            return (Criteria)this;
        }

        public Criteria andOperatorTimeIn(List<Date> values) {
            addCriterion("operator_time in", values, "operatorTime");
            return (Criteria)this;
        }

        public Criteria andOperatorTimeNotIn(List<Date> values) {
            addCriterion("operator_time not in", values, "operatorTime");
            return (Criteria)this;
        }

        public Criteria andOperatorTimeBetween(Date value1, Date value2) {
            addCriterion("operator_time between", value1, value2, "operatorTime");
            return (Criteria)this;
        }

        public Criteria andOperatorTimeNotBetween(Date value1, Date value2) {
            addCriterion("operator_time not between", value1, value2, "operatorTime");
            return (Criteria)this;
        }
		
				public Criteria andOperatorTimeGreaterThan(Date value) {
            addCriterion("operator_time >", value, "operatorTime");
            return (Criteria)this;
        }

        public Criteria andOperatorTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("operator_time >=", value, "operatorTime");
            return (Criteria)this;
        }

        public Criteria andOperatorTimeLessThan(Date value) {
            addCriterion("operator_time <", value, "operatorTime");
            return (Criteria)this;
        }

        public Criteria andOperatorTimeLessThanOrEqualTo(Date value) {
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

        public Criteria andEmailIdEqualTo(Integer value) {
            addCriterion("email_id =", value, "emailId");
            return (Criteria)this;
        }

        public Criteria andEmailIdNotEqualTo(Integer value) {
            addCriterion("email_id <>", value, "emailId");
            return (Criteria)this;
        }

        public Criteria andEmailIdIn(List<Integer> values) {
            addCriterion("email_id in", values, "emailId");
            return (Criteria)this;
        }

        public Criteria andEmailIdNotIn(List<Integer> values) {
            addCriterion("email_id not in", values, "emailId");
            return (Criteria)this;
        }

        public Criteria andEmailIdBetween(Integer value1, Integer value2) {
            addCriterion("email_id between", value1, value2, "emailId");
            return (Criteria)this;
        }

        public Criteria andEmailIdNotBetween(Integer value1, Integer value2) {
            addCriterion("email_id not between", value1, value2, "emailId");
            return (Criteria)this;
        }
		
				public Criteria andEmailIdGreaterThan(Integer value) {
            addCriterion("email_id >", value, "emailId");
            return (Criteria)this;
        }

        public Criteria andEmailIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("email_id >=", value, "emailId");
            return (Criteria)this;
        }

        public Criteria andEmailIdLessThan(Integer value) {
            addCriterion("email_id <", value, "emailId");
            return (Criteria)this;
        }

        public Criteria andEmailIdLessThanOrEqualTo(Integer value) {
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

        public Criteria andTokencolEqualTo(String value) {
            addCriterion("tokencol =", value, "tokencol");
            return (Criteria)this;
        }

        public Criteria andTokencolNotEqualTo(String value) {
            addCriterion("tokencol <>", value, "tokencol");
            return (Criteria)this;
        }

        public Criteria andTokencolIn(List<String> values) {
            addCriterion("tokencol in", values, "tokencol");
            return (Criteria)this;
        }

        public Criteria andTokencolNotIn(List<String> values) {
            addCriterion("tokencol not in", values, "tokencol");
            return (Criteria)this;
        }

        public Criteria andTokencolBetween(String value1, String value2) {
            addCriterion("tokencol between", value1, value2, "tokencol");
            return (Criteria)this;
        }

        public Criteria andTokencolNotBetween(String value1, String value2) {
            addCriterion("tokencol not between", value1, value2, "tokencol");
            return (Criteria)this;
        }
		
				
				public Criteria andTokencolLike(String value) {
            addCriterion("tokencol like", value, "tokencol");
            return (Criteria)this;
        }

        public Criteria andTokencolNotLike(String value) {
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

        public Criteria andTokencol1EqualTo(String value) {
            addCriterion("tokencol1 =", value, "tokencol1");
            return (Criteria)this;
        }

        public Criteria andTokencol1NotEqualTo(String value) {
            addCriterion("tokencol1 <>", value, "tokencol1");
            return (Criteria)this;
        }

        public Criteria andTokencol1In(List<String> values) {
            addCriterion("tokencol1 in", values, "tokencol1");
            return (Criteria)this;
        }

        public Criteria andTokencol1NotIn(List<String> values) {
            addCriterion("tokencol1 not in", values, "tokencol1");
            return (Criteria)this;
        }

        public Criteria andTokencol1Between(String value1, String value2) {
            addCriterion("tokencol1 between", value1, value2, "tokencol1");
            return (Criteria)this;
        }

        public Criteria andTokencol1NotBetween(String value1, String value2) {
            addCriterion("tokencol1 not between", value1, value2, "tokencol1");
            return (Criteria)this;
        }
		
				
				public Criteria andTokencol1Like(String value) {
            addCriterion("tokencol1 like", value, "tokencol1");
            return (Criteria)this;
        }

        public Criteria andTokencol1NotLike(String value) {
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