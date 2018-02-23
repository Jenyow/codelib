package entities.business;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FinanceVoucherExtendExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FinanceVoucherExtendExample() {
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

        public Criteria andVoucherIdIsNull() {
            addCriterion("VOUCHER_ID is null");
            return (Criteria) this;
        }

        public Criteria andVoucherIdIsNotNull() {
            addCriterion("VOUCHER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherIdEqualTo(Integer value) {
            addCriterion("VOUCHER_ID =", value, "voucherId");
            return (Criteria) this;
        }

        public Criteria andVoucherIdNotEqualTo(Integer value) {
            addCriterion("VOUCHER_ID <>", value, "voucherId");
            return (Criteria) this;
        }

        public Criteria andVoucherIdGreaterThan(Integer value) {
            addCriterion("VOUCHER_ID >", value, "voucherId");
            return (Criteria) this;
        }

        public Criteria andVoucherIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("VOUCHER_ID >=", value, "voucherId");
            return (Criteria) this;
        }

        public Criteria andVoucherIdLessThan(Integer value) {
            addCriterion("VOUCHER_ID <", value, "voucherId");
            return (Criteria) this;
        }

        public Criteria andVoucherIdLessThanOrEqualTo(Integer value) {
            addCriterion("VOUCHER_ID <=", value, "voucherId");
            return (Criteria) this;
        }

        public Criteria andVoucherIdIn(List<Integer> values) {
            addCriterion("VOUCHER_ID in", values, "voucherId");
            return (Criteria) this;
        }

        public Criteria andVoucherIdNotIn(List<Integer> values) {
            addCriterion("VOUCHER_ID not in", values, "voucherId");
            return (Criteria) this;
        }

        public Criteria andVoucherIdBetween(Integer value1, Integer value2) {
            addCriterion("VOUCHER_ID between", value1, value2, "voucherId");
            return (Criteria) this;
        }

        public Criteria andVoucherIdNotBetween(Integer value1, Integer value2) {
            addCriterion("VOUCHER_ID not between", value1, value2, "voucherId");
            return (Criteria) this;
        }

        public Criteria andPayerIdIsNull() {
            addCriterion("PAYER_ID is null");
            return (Criteria) this;
        }

        public Criteria andPayerIdIsNotNull() {
            addCriterion("PAYER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPayerIdEqualTo(Integer value) {
            addCriterion("PAYER_ID =", value, "payerId");
            return (Criteria) this;
        }

        public Criteria andPayerIdNotEqualTo(Integer value) {
            addCriterion("PAYER_ID <>", value, "payerId");
            return (Criteria) this;
        }

        public Criteria andPayerIdGreaterThan(Integer value) {
            addCriterion("PAYER_ID >", value, "payerId");
            return (Criteria) this;
        }

        public Criteria andPayerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PAYER_ID >=", value, "payerId");
            return (Criteria) this;
        }

        public Criteria andPayerIdLessThan(Integer value) {
            addCriterion("PAYER_ID <", value, "payerId");
            return (Criteria) this;
        }

        public Criteria andPayerIdLessThanOrEqualTo(Integer value) {
            addCriterion("PAYER_ID <=", value, "payerId");
            return (Criteria) this;
        }

        public Criteria andPayerIdIn(List<Integer> values) {
            addCriterion("PAYER_ID in", values, "payerId");
            return (Criteria) this;
        }

        public Criteria andPayerIdNotIn(List<Integer> values) {
            addCriterion("PAYER_ID not in", values, "payerId");
            return (Criteria) this;
        }

        public Criteria andPayerIdBetween(Integer value1, Integer value2) {
            addCriterion("PAYER_ID between", value1, value2, "payerId");
            return (Criteria) this;
        }

        public Criteria andPayerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PAYER_ID not between", value1, value2, "payerId");
            return (Criteria) this;
        }

        public Criteria andVoucherUserIdIsNull() {
            addCriterion("VOUCHER_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andVoucherUserIdIsNotNull() {
            addCriterion("VOUCHER_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherUserIdEqualTo(Integer value) {
            addCriterion("VOUCHER_USER_ID =", value, "voucherUserId");
            return (Criteria) this;
        }

        public Criteria andVoucherUserIdNotEqualTo(Integer value) {
            addCriterion("VOUCHER_USER_ID <>", value, "voucherUserId");
            return (Criteria) this;
        }

        public Criteria andVoucherUserIdGreaterThan(Integer value) {
            addCriterion("VOUCHER_USER_ID >", value, "voucherUserId");
            return (Criteria) this;
        }

        public Criteria andVoucherUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("VOUCHER_USER_ID >=", value, "voucherUserId");
            return (Criteria) this;
        }

        public Criteria andVoucherUserIdLessThan(Integer value) {
            addCriterion("VOUCHER_USER_ID <", value, "voucherUserId");
            return (Criteria) this;
        }

        public Criteria andVoucherUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("VOUCHER_USER_ID <=", value, "voucherUserId");
            return (Criteria) this;
        }

        public Criteria andVoucherUserIdIn(List<Integer> values) {
            addCriterion("VOUCHER_USER_ID in", values, "voucherUserId");
            return (Criteria) this;
        }

        public Criteria andVoucherUserIdNotIn(List<Integer> values) {
            addCriterion("VOUCHER_USER_ID not in", values, "voucherUserId");
            return (Criteria) this;
        }

        public Criteria andVoucherUserIdBetween(Integer value1, Integer value2) {
            addCriterion("VOUCHER_USER_ID between", value1, value2, "voucherUserId");
            return (Criteria) this;
        }

        public Criteria andVoucherUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("VOUCHER_USER_ID not between", value1, value2, "voucherUserId");
            return (Criteria) this;
        }

        public Criteria andPayerIsNull() {
            addCriterion("PAYER is null");
            return (Criteria) this;
        }

        public Criteria andPayerIsNotNull() {
            addCriterion("PAYER is not null");
            return (Criteria) this;
        }

        public Criteria andPayerEqualTo(String value) {
            addCriterion("PAYER =", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerNotEqualTo(String value) {
            addCriterion("PAYER <>", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerGreaterThan(String value) {
            addCriterion("PAYER >", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerGreaterThanOrEqualTo(String value) {
            addCriterion("PAYER >=", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerLessThan(String value) {
            addCriterion("PAYER <", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerLessThanOrEqualTo(String value) {
            addCriterion("PAYER <=", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerLike(String value) {
            addCriterion("PAYER like", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerNotLike(String value) {
            addCriterion("PAYER not like", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerIn(List<String> values) {
            addCriterion("PAYER in", values, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerNotIn(List<String> values) {
            addCriterion("PAYER not in", values, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerBetween(String value1, String value2) {
            addCriterion("PAYER between", value1, value2, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerNotBetween(String value1, String value2) {
            addCriterion("PAYER not between", value1, value2, "payer");
            return (Criteria) this;
        }

        public Criteria andPaidDateIsNull() {
            addCriterion("PAID_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPaidDateIsNotNull() {
            addCriterion("PAID_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPaidDateEqualTo(Date value) {
            addCriterion("PAID_DATE =", value, "paidDate");
            return (Criteria) this;
        }

        public Criteria andPaidDateNotEqualTo(Date value) {
            addCriterion("PAID_DATE <>", value, "paidDate");
            return (Criteria) this;
        }

        public Criteria andPaidDateGreaterThan(Date value) {
            addCriterion("PAID_DATE >", value, "paidDate");
            return (Criteria) this;
        }

        public Criteria andPaidDateGreaterThanOrEqualTo(Date value) {
            addCriterion("PAID_DATE >=", value, "paidDate");
            return (Criteria) this;
        }

        public Criteria andPaidDateLessThan(Date value) {
            addCriterion("PAID_DATE <", value, "paidDate");
            return (Criteria) this;
        }

        public Criteria andPaidDateLessThanOrEqualTo(Date value) {
            addCriterion("PAID_DATE <=", value, "paidDate");
            return (Criteria) this;
        }

        public Criteria andPaidDateIn(List<Date> values) {
            addCriterion("PAID_DATE in", values, "paidDate");
            return (Criteria) this;
        }

        public Criteria andPaidDateNotIn(List<Date> values) {
            addCriterion("PAID_DATE not in", values, "paidDate");
            return (Criteria) this;
        }

        public Criteria andPaidDateBetween(Date value1, Date value2) {
            addCriterion("PAID_DATE between", value1, value2, "paidDate");
            return (Criteria) this;
        }

        public Criteria andPaidDateNotBetween(Date value1, Date value2) {
            addCriterion("PAID_DATE not between", value1, value2, "paidDate");
            return (Criteria) this;
        }

        public Criteria andPayerLikeInsensitive(String value) {
            addCriterion("upper(PAYER) like", value.toUpperCase(), "payer");
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