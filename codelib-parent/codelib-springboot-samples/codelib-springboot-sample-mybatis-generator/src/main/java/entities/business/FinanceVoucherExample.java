package entities.business;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FinanceVoucherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FinanceVoucherExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("ORDER_ID =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("ORDER_ID <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("ORDER_ID >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ORDER_ID >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("ORDER_ID <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("ORDER_ID <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("ORDER_ID in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("ORDER_ID not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_ID between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_ID not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andVoucherCodeIsNull() {
            addCriterion("VOUCHER_CODE is null");
            return (Criteria) this;
        }

        public Criteria andVoucherCodeIsNotNull() {
            addCriterion("VOUCHER_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherCodeEqualTo(String value) {
            addCriterion("VOUCHER_CODE =", value, "voucherCode");
            return (Criteria) this;
        }

        public Criteria andVoucherCodeNotEqualTo(String value) {
            addCriterion("VOUCHER_CODE <>", value, "voucherCode");
            return (Criteria) this;
        }

        public Criteria andVoucherCodeGreaterThan(String value) {
            addCriterion("VOUCHER_CODE >", value, "voucherCode");
            return (Criteria) this;
        }

        public Criteria andVoucherCodeGreaterThanOrEqualTo(String value) {
            addCriterion("VOUCHER_CODE >=", value, "voucherCode");
            return (Criteria) this;
        }

        public Criteria andVoucherCodeLessThan(String value) {
            addCriterion("VOUCHER_CODE <", value, "voucherCode");
            return (Criteria) this;
        }

        public Criteria andVoucherCodeLessThanOrEqualTo(String value) {
            addCriterion("VOUCHER_CODE <=", value, "voucherCode");
            return (Criteria) this;
        }

        public Criteria andVoucherCodeLike(String value) {
            addCriterion("VOUCHER_CODE like", value, "voucherCode");
            return (Criteria) this;
        }

        public Criteria andVoucherCodeNotLike(String value) {
            addCriterion("VOUCHER_CODE not like", value, "voucherCode");
            return (Criteria) this;
        }

        public Criteria andVoucherCodeIn(List<String> values) {
            addCriterion("VOUCHER_CODE in", values, "voucherCode");
            return (Criteria) this;
        }

        public Criteria andVoucherCodeNotIn(List<String> values) {
            addCriterion("VOUCHER_CODE not in", values, "voucherCode");
            return (Criteria) this;
        }

        public Criteria andVoucherCodeBetween(String value1, String value2) {
            addCriterion("VOUCHER_CODE between", value1, value2, "voucherCode");
            return (Criteria) this;
        }

        public Criteria andVoucherCodeNotBetween(String value1, String value2) {
            addCriterion("VOUCHER_CODE not between", value1, value2, "voucherCode");
            return (Criteria) this;
        }

        public Criteria andVoucherAmountIsNull() {
            addCriterion("VOUCHER_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andVoucherAmountIsNotNull() {
            addCriterion("VOUCHER_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherAmountEqualTo(BigDecimal value) {
            addCriterion("VOUCHER_AMOUNT =", value, "voucherAmount");
            return (Criteria) this;
        }

        public Criteria andVoucherAmountNotEqualTo(BigDecimal value) {
            addCriterion("VOUCHER_AMOUNT <>", value, "voucherAmount");
            return (Criteria) this;
        }

        public Criteria andVoucherAmountGreaterThan(BigDecimal value) {
            addCriterion("VOUCHER_AMOUNT >", value, "voucherAmount");
            return (Criteria) this;
        }

        public Criteria andVoucherAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("VOUCHER_AMOUNT >=", value, "voucherAmount");
            return (Criteria) this;
        }

        public Criteria andVoucherAmountLessThan(BigDecimal value) {
            addCriterion("VOUCHER_AMOUNT <", value, "voucherAmount");
            return (Criteria) this;
        }

        public Criteria andVoucherAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("VOUCHER_AMOUNT <=", value, "voucherAmount");
            return (Criteria) this;
        }

        public Criteria andVoucherAmountIn(List<BigDecimal> values) {
            addCriterion("VOUCHER_AMOUNT in", values, "voucherAmount");
            return (Criteria) this;
        }

        public Criteria andVoucherAmountNotIn(List<BigDecimal> values) {
            addCriterion("VOUCHER_AMOUNT not in", values, "voucherAmount");
            return (Criteria) this;
        }

        public Criteria andVoucherAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VOUCHER_AMOUNT between", value1, value2, "voucherAmount");
            return (Criteria) this;
        }

        public Criteria andVoucherAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VOUCHER_AMOUNT not between", value1, value2, "voucherAmount");
            return (Criteria) this;
        }

        public Criteria andPaidTypeIsNull() {
            addCriterion("PAID_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPaidTypeIsNotNull() {
            addCriterion("PAID_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPaidTypeEqualTo(Short value) {
            addCriterion("PAID_TYPE =", value, "paidType");
            return (Criteria) this;
        }

        public Criteria andPaidTypeNotEqualTo(Short value) {
            addCriterion("PAID_TYPE <>", value, "paidType");
            return (Criteria) this;
        }

        public Criteria andPaidTypeGreaterThan(Short value) {
            addCriterion("PAID_TYPE >", value, "paidType");
            return (Criteria) this;
        }

        public Criteria andPaidTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("PAID_TYPE >=", value, "paidType");
            return (Criteria) this;
        }

        public Criteria andPaidTypeLessThan(Short value) {
            addCriterion("PAID_TYPE <", value, "paidType");
            return (Criteria) this;
        }

        public Criteria andPaidTypeLessThanOrEqualTo(Short value) {
            addCriterion("PAID_TYPE <=", value, "paidType");
            return (Criteria) this;
        }

        public Criteria andPaidTypeIn(List<Short> values) {
            addCriterion("PAID_TYPE in", values, "paidType");
            return (Criteria) this;
        }

        public Criteria andPaidTypeNotIn(List<Short> values) {
            addCriterion("PAID_TYPE not in", values, "paidType");
            return (Criteria) this;
        }

        public Criteria andPaidTypeBetween(Short value1, Short value2) {
            addCriterion("PAID_TYPE between", value1, value2, "paidType");
            return (Criteria) this;
        }

        public Criteria andPaidTypeNotBetween(Short value1, Short value2) {
            addCriterion("PAID_TYPE not between", value1, value2, "paidType");
            return (Criteria) this;
        }

        public Criteria andFundDateIsNull() {
            addCriterion("FUND_DATE is null");
            return (Criteria) this;
        }

        public Criteria andFundDateIsNotNull() {
            addCriterion("FUND_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andFundDateEqualTo(Date value) {
            addCriterion("FUND_DATE =", value, "fundDate");
            return (Criteria) this;
        }

        public Criteria andFundDateNotEqualTo(Date value) {
            addCriterion("FUND_DATE <>", value, "fundDate");
            return (Criteria) this;
        }

        public Criteria andFundDateGreaterThan(Date value) {
            addCriterion("FUND_DATE >", value, "fundDate");
            return (Criteria) this;
        }

        public Criteria andFundDateGreaterThanOrEqualTo(Date value) {
            addCriterion("FUND_DATE >=", value, "fundDate");
            return (Criteria) this;
        }

        public Criteria andFundDateLessThan(Date value) {
            addCriterion("FUND_DATE <", value, "fundDate");
            return (Criteria) this;
        }

        public Criteria andFundDateLessThanOrEqualTo(Date value) {
            addCriterion("FUND_DATE <=", value, "fundDate");
            return (Criteria) this;
        }

        public Criteria andFundDateIn(List<Date> values) {
            addCriterion("FUND_DATE in", values, "fundDate");
            return (Criteria) this;
        }

        public Criteria andFundDateNotIn(List<Date> values) {
            addCriterion("FUND_DATE not in", values, "fundDate");
            return (Criteria) this;
        }

        public Criteria andFundDateBetween(Date value1, Date value2) {
            addCriterion("FUND_DATE between", value1, value2, "fundDate");
            return (Criteria) this;
        }

        public Criteria andFundDateNotBetween(Date value1, Date value2) {
            addCriterion("FUND_DATE not between", value1, value2, "fundDate");
            return (Criteria) this;
        }

        public Criteria andIsInvoicedIsNull() {
            addCriterion("IS_INVOICED is null");
            return (Criteria) this;
        }

        public Criteria andIsInvoicedIsNotNull() {
            addCriterion("IS_INVOICED is not null");
            return (Criteria) this;
        }

        public Criteria andIsInvoicedEqualTo(Boolean value) {
            addCriterion("IS_INVOICED =", value, "isInvoiced");
            return (Criteria) this;
        }

        public Criteria andIsInvoicedNotEqualTo(Boolean value) {
            addCriterion("IS_INVOICED <>", value, "isInvoiced");
            return (Criteria) this;
        }

        public Criteria andIsInvoicedGreaterThan(Boolean value) {
            addCriterion("IS_INVOICED >", value, "isInvoiced");
            return (Criteria) this;
        }

        public Criteria andIsInvoicedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IS_INVOICED >=", value, "isInvoiced");
            return (Criteria) this;
        }

        public Criteria andIsInvoicedLessThan(Boolean value) {
            addCriterion("IS_INVOICED <", value, "isInvoiced");
            return (Criteria) this;
        }

        public Criteria andIsInvoicedLessThanOrEqualTo(Boolean value) {
            addCriterion("IS_INVOICED <=", value, "isInvoiced");
            return (Criteria) this;
        }

        public Criteria andIsInvoicedIn(List<Boolean> values) {
            addCriterion("IS_INVOICED in", values, "isInvoiced");
            return (Criteria) this;
        }

        public Criteria andIsInvoicedNotIn(List<Boolean> values) {
            addCriterion("IS_INVOICED not in", values, "isInvoiced");
            return (Criteria) this;
        }

        public Criteria andIsInvoicedBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_INVOICED between", value1, value2, "isInvoiced");
            return (Criteria) this;
        }

        public Criteria andIsInvoicedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_INVOICED not between", value1, value2, "isInvoiced");
            return (Criteria) this;
        }

        public Criteria andInvoicedStatusIsNull() {
            addCriterion("INVOICED_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andInvoicedStatusIsNotNull() {
            addCriterion("INVOICED_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicedStatusEqualTo(Short value) {
            addCriterion("INVOICED_STATUS =", value, "invoicedStatus");
            return (Criteria) this;
        }

        public Criteria andInvoicedStatusNotEqualTo(Short value) {
            addCriterion("INVOICED_STATUS <>", value, "invoicedStatus");
            return (Criteria) this;
        }

        public Criteria andInvoicedStatusGreaterThan(Short value) {
            addCriterion("INVOICED_STATUS >", value, "invoicedStatus");
            return (Criteria) this;
        }

        public Criteria andInvoicedStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("INVOICED_STATUS >=", value, "invoicedStatus");
            return (Criteria) this;
        }

        public Criteria andInvoicedStatusLessThan(Short value) {
            addCriterion("INVOICED_STATUS <", value, "invoicedStatus");
            return (Criteria) this;
        }

        public Criteria andInvoicedStatusLessThanOrEqualTo(Short value) {
            addCriterion("INVOICED_STATUS <=", value, "invoicedStatus");
            return (Criteria) this;
        }

        public Criteria andInvoicedStatusIn(List<Short> values) {
            addCriterion("INVOICED_STATUS in", values, "invoicedStatus");
            return (Criteria) this;
        }

        public Criteria andInvoicedStatusNotIn(List<Short> values) {
            addCriterion("INVOICED_STATUS not in", values, "invoicedStatus");
            return (Criteria) this;
        }

        public Criteria andInvoicedStatusBetween(Short value1, Short value2) {
            addCriterion("INVOICED_STATUS between", value1, value2, "invoicedStatus");
            return (Criteria) this;
        }

        public Criteria andInvoicedStatusNotBetween(Short value1, Short value2) {
            addCriterion("INVOICED_STATUS not between", value1, value2, "invoicedStatus");
            return (Criteria) this;
        }

        public Criteria andInvoicedUserNameIsNull() {
            addCriterion("INVOICED_USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andInvoicedUserNameIsNotNull() {
            addCriterion("INVOICED_USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicedUserNameEqualTo(String value) {
            addCriterion("INVOICED_USER_NAME =", value, "invoicedUserName");
            return (Criteria) this;
        }

        public Criteria andInvoicedUserNameNotEqualTo(String value) {
            addCriterion("INVOICED_USER_NAME <>", value, "invoicedUserName");
            return (Criteria) this;
        }

        public Criteria andInvoicedUserNameGreaterThan(String value) {
            addCriterion("INVOICED_USER_NAME >", value, "invoicedUserName");
            return (Criteria) this;
        }

        public Criteria andInvoicedUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICED_USER_NAME >=", value, "invoicedUserName");
            return (Criteria) this;
        }

        public Criteria andInvoicedUserNameLessThan(String value) {
            addCriterion("INVOICED_USER_NAME <", value, "invoicedUserName");
            return (Criteria) this;
        }

        public Criteria andInvoicedUserNameLessThanOrEqualTo(String value) {
            addCriterion("INVOICED_USER_NAME <=", value, "invoicedUserName");
            return (Criteria) this;
        }

        public Criteria andInvoicedUserNameLike(String value) {
            addCriterion("INVOICED_USER_NAME like", value, "invoicedUserName");
            return (Criteria) this;
        }

        public Criteria andInvoicedUserNameNotLike(String value) {
            addCriterion("INVOICED_USER_NAME not like", value, "invoicedUserName");
            return (Criteria) this;
        }

        public Criteria andInvoicedUserNameIn(List<String> values) {
            addCriterion("INVOICED_USER_NAME in", values, "invoicedUserName");
            return (Criteria) this;
        }

        public Criteria andInvoicedUserNameNotIn(List<String> values) {
            addCriterion("INVOICED_USER_NAME not in", values, "invoicedUserName");
            return (Criteria) this;
        }

        public Criteria andInvoicedUserNameBetween(String value1, String value2) {
            addCriterion("INVOICED_USER_NAME between", value1, value2, "invoicedUserName");
            return (Criteria) this;
        }

        public Criteria andInvoicedUserNameNotBetween(String value1, String value2) {
            addCriterion("INVOICED_USER_NAME not between", value1, value2, "invoicedUserName");
            return (Criteria) this;
        }

        public Criteria andInvoicedDateIsNull() {
            addCriterion("INVOICED_DATE is null");
            return (Criteria) this;
        }

        public Criteria andInvoicedDateIsNotNull() {
            addCriterion("INVOICED_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicedDateEqualTo(Date value) {
            addCriterion("INVOICED_DATE =", value, "invoicedDate");
            return (Criteria) this;
        }

        public Criteria andInvoicedDateNotEqualTo(Date value) {
            addCriterion("INVOICED_DATE <>", value, "invoicedDate");
            return (Criteria) this;
        }

        public Criteria andInvoicedDateGreaterThan(Date value) {
            addCriterion("INVOICED_DATE >", value, "invoicedDate");
            return (Criteria) this;
        }

        public Criteria andInvoicedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("INVOICED_DATE >=", value, "invoicedDate");
            return (Criteria) this;
        }

        public Criteria andInvoicedDateLessThan(Date value) {
            addCriterion("INVOICED_DATE <", value, "invoicedDate");
            return (Criteria) this;
        }

        public Criteria andInvoicedDateLessThanOrEqualTo(Date value) {
            addCriterion("INVOICED_DATE <=", value, "invoicedDate");
            return (Criteria) this;
        }

        public Criteria andInvoicedDateIn(List<Date> values) {
            addCriterion("INVOICED_DATE in", values, "invoicedDate");
            return (Criteria) this;
        }

        public Criteria andInvoicedDateNotIn(List<Date> values) {
            addCriterion("INVOICED_DATE not in", values, "invoicedDate");
            return (Criteria) this;
        }

        public Criteria andInvoicedDateBetween(Date value1, Date value2) {
            addCriterion("INVOICED_DATE between", value1, value2, "invoicedDate");
            return (Criteria) this;
        }

        public Criteria andInvoicedDateNotBetween(Date value1, Date value2) {
            addCriterion("INVOICED_DATE not between", value1, value2, "invoicedDate");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdIsNull() {
            addCriterion("AUDIT_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdIsNotNull() {
            addCriterion("AUDIT_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdEqualTo(String value) {
            addCriterion("AUDIT_USER_ID =", value, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdNotEqualTo(String value) {
            addCriterion("AUDIT_USER_ID <>", value, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdGreaterThan(String value) {
            addCriterion("AUDIT_USER_ID >", value, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("AUDIT_USER_ID >=", value, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdLessThan(String value) {
            addCriterion("AUDIT_USER_ID <", value, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdLessThanOrEqualTo(String value) {
            addCriterion("AUDIT_USER_ID <=", value, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdLike(String value) {
            addCriterion("AUDIT_USER_ID like", value, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdNotLike(String value) {
            addCriterion("AUDIT_USER_ID not like", value, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdIn(List<String> values) {
            addCriterion("AUDIT_USER_ID in", values, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdNotIn(List<String> values) {
            addCriterion("AUDIT_USER_ID not in", values, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdBetween(String value1, String value2) {
            addCriterion("AUDIT_USER_ID between", value1, value2, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdNotBetween(String value1, String value2) {
            addCriterion("AUDIT_USER_ID not between", value1, value2, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNull() {
            addCriterion("AUDIT_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNotNull() {
            addCriterion("AUDIT_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusEqualTo(Short value) {
            addCriterion("AUDIT_STATUS =", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotEqualTo(Short value) {
            addCriterion("AUDIT_STATUS <>", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThan(Short value) {
            addCriterion("AUDIT_STATUS >", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("AUDIT_STATUS >=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThan(Short value) {
            addCriterion("AUDIT_STATUS <", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThanOrEqualTo(Short value) {
            addCriterion("AUDIT_STATUS <=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIn(List<Short> values) {
            addCriterion("AUDIT_STATUS in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotIn(List<Short> values) {
            addCriterion("AUDIT_STATUS not in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusBetween(Short value1, Short value2) {
            addCriterion("AUDIT_STATUS between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotBetween(Short value1, Short value2) {
            addCriterion("AUDIT_STATUS not between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNull() {
            addCriterion("AUDIT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNotNull() {
            addCriterion("AUDIT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeEqualTo(Date value) {
            addCriterion("AUDIT_TIME =", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotEqualTo(Date value) {
            addCriterion("AUDIT_TIME <>", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThan(Date value) {
            addCriterion("AUDIT_TIME >", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("AUDIT_TIME >=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThan(Date value) {
            addCriterion("AUDIT_TIME <", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThanOrEqualTo(Date value) {
            addCriterion("AUDIT_TIME <=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIn(List<Date> values) {
            addCriterion("AUDIT_TIME in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotIn(List<Date> values) {
            addCriterion("AUDIT_TIME not in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeBetween(Date value1, Date value2) {
            addCriterion("AUDIT_TIME between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotBetween(Date value1, Date value2) {
            addCriterion("AUDIT_TIME not between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andVoucherStatusIsNull() {
            addCriterion("VOUCHER_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andVoucherStatusIsNotNull() {
            addCriterion("VOUCHER_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherStatusEqualTo(Short value) {
            addCriterion("VOUCHER_STATUS =", value, "voucherStatus");
            return (Criteria) this;
        }

        public Criteria andVoucherStatusNotEqualTo(Short value) {
            addCriterion("VOUCHER_STATUS <>", value, "voucherStatus");
            return (Criteria) this;
        }

        public Criteria andVoucherStatusGreaterThan(Short value) {
            addCriterion("VOUCHER_STATUS >", value, "voucherStatus");
            return (Criteria) this;
        }

        public Criteria andVoucherStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("VOUCHER_STATUS >=", value, "voucherStatus");
            return (Criteria) this;
        }

        public Criteria andVoucherStatusLessThan(Short value) {
            addCriterion("VOUCHER_STATUS <", value, "voucherStatus");
            return (Criteria) this;
        }

        public Criteria andVoucherStatusLessThanOrEqualTo(Short value) {
            addCriterion("VOUCHER_STATUS <=", value, "voucherStatus");
            return (Criteria) this;
        }

        public Criteria andVoucherStatusIn(List<Short> values) {
            addCriterion("VOUCHER_STATUS in", values, "voucherStatus");
            return (Criteria) this;
        }

        public Criteria andVoucherStatusNotIn(List<Short> values) {
            addCriterion("VOUCHER_STATUS not in", values, "voucherStatus");
            return (Criteria) this;
        }

        public Criteria andVoucherStatusBetween(Short value1, Short value2) {
            addCriterion("VOUCHER_STATUS between", value1, value2, "voucherStatus");
            return (Criteria) this;
        }

        public Criteria andVoucherStatusNotBetween(Short value1, Short value2) {
            addCriterion("VOUCHER_STATUS not between", value1, value2, "voucherStatus");
            return (Criteria) this;
        }

        public Criteria andAccountingDateIsNull() {
            addCriterion("ACCOUNTING_DATE is null");
            return (Criteria) this;
        }

        public Criteria andAccountingDateIsNotNull() {
            addCriterion("ACCOUNTING_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andAccountingDateEqualTo(Date value) {
            addCriterion("ACCOUNTING_DATE =", value, "accountingDate");
            return (Criteria) this;
        }

        public Criteria andAccountingDateNotEqualTo(Date value) {
            addCriterion("ACCOUNTING_DATE <>", value, "accountingDate");
            return (Criteria) this;
        }

        public Criteria andAccountingDateGreaterThan(Date value) {
            addCriterion("ACCOUNTING_DATE >", value, "accountingDate");
            return (Criteria) this;
        }

        public Criteria andAccountingDateGreaterThanOrEqualTo(Date value) {
            addCriterion("ACCOUNTING_DATE >=", value, "accountingDate");
            return (Criteria) this;
        }

        public Criteria andAccountingDateLessThan(Date value) {
            addCriterion("ACCOUNTING_DATE <", value, "accountingDate");
            return (Criteria) this;
        }

        public Criteria andAccountingDateLessThanOrEqualTo(Date value) {
            addCriterion("ACCOUNTING_DATE <=", value, "accountingDate");
            return (Criteria) this;
        }

        public Criteria andAccountingDateIn(List<Date> values) {
            addCriterion("ACCOUNTING_DATE in", values, "accountingDate");
            return (Criteria) this;
        }

        public Criteria andAccountingDateNotIn(List<Date> values) {
            addCriterion("ACCOUNTING_DATE not in", values, "accountingDate");
            return (Criteria) this;
        }

        public Criteria andAccountingDateBetween(Date value1, Date value2) {
            addCriterion("ACCOUNTING_DATE between", value1, value2, "accountingDate");
            return (Criteria) this;
        }

        public Criteria andAccountingDateNotBetween(Date value1, Date value2) {
            addCriterion("ACCOUNTING_DATE not between", value1, value2, "accountingDate");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNull() {
            addCriterion("IS_DELETED is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("IS_DELETED is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualTo(Boolean value) {
            addCriterion("IS_DELETED =", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(Boolean value) {
            addCriterion("IS_DELETED <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(Boolean value) {
            addCriterion("IS_DELETED >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IS_DELETED >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(Boolean value) {
            addCriterion("IS_DELETED <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("IS_DELETED <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<Boolean> values) {
            addCriterion("IS_DELETED in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<Boolean> values) {
            addCriterion("IS_DELETED not in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_DELETED between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_DELETED not between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("MEMO is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("MEMO =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("MEMO <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("MEMO >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("MEMO >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("MEMO <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("MEMO <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("MEMO like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("MEMO not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("MEMO in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("MEMO not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("MEMO between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("MEMO not between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateUseridIsNull() {
            addCriterion("CREATE_USERID is null");
            return (Criteria) this;
        }

        public Criteria andCreateUseridIsNotNull() {
            addCriterion("CREATE_USERID is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUseridEqualTo(String value) {
            addCriterion("CREATE_USERID =", value, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridNotEqualTo(String value) {
            addCriterion("CREATE_USERID <>", value, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridGreaterThan(String value) {
            addCriterion("CREATE_USERID >", value, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_USERID >=", value, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridLessThan(String value) {
            addCriterion("CREATE_USERID <", value, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridLessThanOrEqualTo(String value) {
            addCriterion("CREATE_USERID <=", value, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridLike(String value) {
            addCriterion("CREATE_USERID like", value, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridNotLike(String value) {
            addCriterion("CREATE_USERID not like", value, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridIn(List<String> values) {
            addCriterion("CREATE_USERID in", values, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridNotIn(List<String> values) {
            addCriterion("CREATE_USERID not in", values, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridBetween(String value1, String value2) {
            addCriterion("CREATE_USERID between", value1, value2, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridNotBetween(String value1, String value2) {
            addCriterion("CREATE_USERID not between", value1, value2, "createUserid");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeIsNull() {
            addCriterion("MODIFIED_TIME is null");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeIsNotNull() {
            addCriterion("MODIFIED_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeEqualTo(Date value) {
            addCriterion("MODIFIED_TIME =", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeNotEqualTo(Date value) {
            addCriterion("MODIFIED_TIME <>", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeGreaterThan(Date value) {
            addCriterion("MODIFIED_TIME >", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("MODIFIED_TIME >=", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeLessThan(Date value) {
            addCriterion("MODIFIED_TIME <", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeLessThanOrEqualTo(Date value) {
            addCriterion("MODIFIED_TIME <=", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeIn(List<Date> values) {
            addCriterion("MODIFIED_TIME in", values, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeNotIn(List<Date> values) {
            addCriterion("MODIFIED_TIME not in", values, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeBetween(Date value1, Date value2) {
            addCriterion("MODIFIED_TIME between", value1, value2, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeNotBetween(Date value1, Date value2) {
            addCriterion("MODIFIED_TIME not between", value1, value2, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedUseridIsNull() {
            addCriterion("MODIFIED_USERID is null");
            return (Criteria) this;
        }

        public Criteria andModifiedUseridIsNotNull() {
            addCriterion("MODIFIED_USERID is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedUseridEqualTo(String value) {
            addCriterion("MODIFIED_USERID =", value, "modifiedUserid");
            return (Criteria) this;
        }

        public Criteria andModifiedUseridNotEqualTo(String value) {
            addCriterion("MODIFIED_USERID <>", value, "modifiedUserid");
            return (Criteria) this;
        }

        public Criteria andModifiedUseridGreaterThan(String value) {
            addCriterion("MODIFIED_USERID >", value, "modifiedUserid");
            return (Criteria) this;
        }

        public Criteria andModifiedUseridGreaterThanOrEqualTo(String value) {
            addCriterion("MODIFIED_USERID >=", value, "modifiedUserid");
            return (Criteria) this;
        }

        public Criteria andModifiedUseridLessThan(String value) {
            addCriterion("MODIFIED_USERID <", value, "modifiedUserid");
            return (Criteria) this;
        }

        public Criteria andModifiedUseridLessThanOrEqualTo(String value) {
            addCriterion("MODIFIED_USERID <=", value, "modifiedUserid");
            return (Criteria) this;
        }

        public Criteria andModifiedUseridLike(String value) {
            addCriterion("MODIFIED_USERID like", value, "modifiedUserid");
            return (Criteria) this;
        }

        public Criteria andModifiedUseridNotLike(String value) {
            addCriterion("MODIFIED_USERID not like", value, "modifiedUserid");
            return (Criteria) this;
        }

        public Criteria andModifiedUseridIn(List<String> values) {
            addCriterion("MODIFIED_USERID in", values, "modifiedUserid");
            return (Criteria) this;
        }

        public Criteria andModifiedUseridNotIn(List<String> values) {
            addCriterion("MODIFIED_USERID not in", values, "modifiedUserid");
            return (Criteria) this;
        }

        public Criteria andModifiedUseridBetween(String value1, String value2) {
            addCriterion("MODIFIED_USERID between", value1, value2, "modifiedUserid");
            return (Criteria) this;
        }

        public Criteria andModifiedUseridNotBetween(String value1, String value2) {
            addCriterion("MODIFIED_USERID not between", value1, value2, "modifiedUserid");
            return (Criteria) this;
        }

        public Criteria andVoucherCodeLikeInsensitive(String value) {
            addCriterion("upper(VOUCHER_CODE) like", value.toUpperCase(), "voucherCode");
            return (Criteria) this;
        }

        public Criteria andInvoicedUserNameLikeInsensitive(String value) {
            addCriterion("upper(INVOICED_USER_NAME) like", value.toUpperCase(), "invoicedUserName");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdLikeInsensitive(String value) {
            addCriterion("upper(AUDIT_USER_ID) like", value.toUpperCase(), "auditUserId");
            return (Criteria) this;
        }

        public Criteria andMemoLikeInsensitive(String value) {
            addCriterion("upper(MEMO) like", value.toUpperCase(), "memo");
            return (Criteria) this;
        }

        public Criteria andCreateUseridLikeInsensitive(String value) {
            addCriterion("upper(CREATE_USERID) like", value.toUpperCase(), "createUserid");
            return (Criteria) this;
        }

        public Criteria andModifiedUseridLikeInsensitive(String value) {
            addCriterion("upper(MODIFIED_USERID) like", value.toUpperCase(), "modifiedUserid");
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