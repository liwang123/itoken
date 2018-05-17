package com.thingtrust.token.domain.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *  查询条件example类
 * @author wang yu
 * @date 2018-05-17
 */
public class PaymentTokenExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PaymentTokenExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria)this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria)this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria)this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria)this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria)this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria)this;
        }
		
				public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria)this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria)this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria)this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria)this;
        }
				
			        public Criteria andTokenIdIsNull() {
            addCriterion("token_id is null");
            return (Criteria)this;
        }

        public Criteria andTokenIdIsNotNull() {
            addCriterion("token_id is not null");
            return (Criteria)this;
        }

        public Criteria andTokenIdEqualTo(Long value) {
            addCriterion("token_id =", value, "tokenId");
            return (Criteria)this;
        }

        public Criteria andTokenIdNotEqualTo(Long value) {
            addCriterion("token_id <>", value, "tokenId");
            return (Criteria)this;
        }

        public Criteria andTokenIdIn(List<Long> values) {
            addCriterion("token_id in", values, "tokenId");
            return (Criteria)this;
        }

        public Criteria andTokenIdNotIn(List<Long> values) {
            addCriterion("token_id not in", values, "tokenId");
            return (Criteria)this;
        }

        public Criteria andTokenIdBetween(Long value1, Long value2) {
            addCriterion("token_id between", value1, value2, "tokenId");
            return (Criteria)this;
        }

        public Criteria andTokenIdNotBetween(Long value1, Long value2) {
            addCriterion("token_id not between", value1, value2, "tokenId");
            return (Criteria)this;
        }
		
				public Criteria andTokenIdGreaterThan(Long value) {
            addCriterion("token_id >", value, "tokenId");
            return (Criteria)this;
        }

        public Criteria andTokenIdGreaterThanOrEqualTo(Long value) {
            addCriterion("token_id >=", value, "tokenId");
            return (Criteria)this;
        }

        public Criteria andTokenIdLessThan(Long value) {
            addCriterion("token_id <", value, "tokenId");
            return (Criteria)this;
        }

        public Criteria andTokenIdLessThanOrEqualTo(Long value) {
            addCriterion("token_id <=", value, "tokenId");
            return (Criteria)this;
        }
				
			        public Criteria andSymbolIsNull() {
            addCriterion("symbol is null");
            return (Criteria)this;
        }

        public Criteria andSymbolIsNotNull() {
            addCriterion("symbol is not null");
            return (Criteria)this;
        }

        public Criteria andSymbolEqualTo(String value) {
            addCriterion("symbol =", value, "symbol");
            return (Criteria)this;
        }

        public Criteria andSymbolNotEqualTo(String value) {
            addCriterion("symbol <>", value, "symbol");
            return (Criteria)this;
        }

        public Criteria andSymbolIn(List<String> values) {
            addCriterion("symbol in", values, "symbol");
            return (Criteria)this;
        }

        public Criteria andSymbolNotIn(List<String> values) {
            addCriterion("symbol not in", values, "symbol");
            return (Criteria)this;
        }

        public Criteria andSymbolBetween(String value1, String value2) {
            addCriterion("symbol between", value1, value2, "symbol");
            return (Criteria)this;
        }

        public Criteria andSymbolNotBetween(String value1, String value2) {
            addCriterion("symbol not between", value1, value2, "symbol");
            return (Criteria)this;
        }
		
				
				public Criteria andSymbolLike(String value) {
            addCriterion("symbol like", value, "symbol");
            return (Criteria)this;
        }

        public Criteria andSymbolNotLike(String value) {
            addCriterion("symbol not like", value, "symbol");
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
			        public Criteria andAssetIdIsNull() {
            addCriterion("asset_id is null");
            return (Criteria)this;
        }

        public Criteria andAssetIdIsNotNull() {
            addCriterion("asset_id is not null");
            return (Criteria)this;
        }

        public Criteria andAssetIdEqualTo(String value) {
            addCriterion("asset_id =", value, "assetId");
            return (Criteria)this;
        }

        public Criteria andAssetIdNotEqualTo(String value) {
            addCriterion("asset_id <>", value, "assetId");
            return (Criteria)this;
        }

        public Criteria andAssetIdIn(List<String> values) {
            addCriterion("asset_id in", values, "assetId");
            return (Criteria)this;
        }

        public Criteria andAssetIdNotIn(List<String> values) {
            addCriterion("asset_id not in", values, "assetId");
            return (Criteria)this;
        }

        public Criteria andAssetIdBetween(String value1, String value2) {
            addCriterion("asset_id between", value1, value2, "assetId");
            return (Criteria)this;
        }

        public Criteria andAssetIdNotBetween(String value1, String value2) {
            addCriterion("asset_id not between", value1, value2, "assetId");
            return (Criteria)this;
        }
		
				
				public Criteria andAssetIdLike(String value) {
            addCriterion("asset_id like", value, "assetId");
            return (Criteria)this;
        }

        public Criteria andAssetIdNotLike(String value) {
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
			        public Criteria andEmailIdIsNull() {
            addCriterion("email_id is null");
            return (Criteria)this;
        }

        public Criteria andEmailIdIsNotNull() {
            addCriterion("email_id is not null");
            return (Criteria)this;
        }

        public Criteria andEmailIdEqualTo(Long value) {
            addCriterion("email_id =", value, "emailId");
            return (Criteria)this;
        }

        public Criteria andEmailIdNotEqualTo(Long value) {
            addCriterion("email_id <>", value, "emailId");
            return (Criteria)this;
        }

        public Criteria andEmailIdIn(List<Long> values) {
            addCriterion("email_id in", values, "emailId");
            return (Criteria)this;
        }

        public Criteria andEmailIdNotIn(List<Long> values) {
            addCriterion("email_id not in", values, "emailId");
            return (Criteria)this;
        }

        public Criteria andEmailIdBetween(Long value1, Long value2) {
            addCriterion("email_id between", value1, value2, "emailId");
            return (Criteria)this;
        }

        public Criteria andEmailIdNotBetween(Long value1, Long value2) {
            addCriterion("email_id not between", value1, value2, "emailId");
            return (Criteria)this;
        }
		
				public Criteria andEmailIdGreaterThan(Long value) {
            addCriterion("email_id >", value, "emailId");
            return (Criteria)this;
        }

        public Criteria andEmailIdGreaterThanOrEqualTo(Long value) {
            addCriterion("email_id >=", value, "emailId");
            return (Criteria)this;
        }

        public Criteria andEmailIdLessThan(Long value) {
            addCriterion("email_id <", value, "emailId");
            return (Criteria)this;
        }

        public Criteria andEmailIdLessThanOrEqualTo(Long value) {
            addCriterion("email_id <=", value, "emailId");
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
			        public Criteria andDescriptIsNull() {
            addCriterion("descript is null");
            return (Criteria)this;
        }

        public Criteria andDescriptIsNotNull() {
            addCriterion("descript is not null");
            return (Criteria)this;
        }

        public Criteria andDescriptEqualTo(String value) {
            addCriterion("descript =", value, "descript");
            return (Criteria)this;
        }

        public Criteria andDescriptNotEqualTo(String value) {
            addCriterion("descript <>", value, "descript");
            return (Criteria)this;
        }

        public Criteria andDescriptIn(List<String> values) {
            addCriterion("descript in", values, "descript");
            return (Criteria)this;
        }

        public Criteria andDescriptNotIn(List<String> values) {
            addCriterion("descript not in", values, "descript");
            return (Criteria)this;
        }

        public Criteria andDescriptBetween(String value1, String value2) {
            addCriterion("descript between", value1, value2, "descript");
            return (Criteria)this;
        }

        public Criteria andDescriptNotBetween(String value1, String value2) {
            addCriterion("descript not between", value1, value2, "descript");
            return (Criteria)this;
        }
		
				
				public Criteria andDescriptLike(String value) {
            addCriterion("descript like", value, "descript");
            return (Criteria)this;
        }

        public Criteria andDescriptNotLike(String value) {
            addCriterion("descript not like", value, "descript");
            return (Criteria)this;
        }
			        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria)this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria)this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria)this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria)this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria)this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria)this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria)this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria)this;
        }
		
				public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria)this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria)this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria)this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
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