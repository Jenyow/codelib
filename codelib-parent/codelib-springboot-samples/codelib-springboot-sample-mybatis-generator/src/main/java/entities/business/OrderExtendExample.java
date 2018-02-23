package entities.business;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderExtendExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExtendExample() {
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

        public Criteria andSubmitedTimeIsNull() {
            addCriterion("SUBMITED_TIME is null");
            return (Criteria) this;
        }

        public Criteria andSubmitedTimeIsNotNull() {
            addCriterion("SUBMITED_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitedTimeEqualTo(Date value) {
            addCriterion("SUBMITED_TIME =", value, "submitedTime");
            return (Criteria) this;
        }

        public Criteria andSubmitedTimeNotEqualTo(Date value) {
            addCriterion("SUBMITED_TIME <>", value, "submitedTime");
            return (Criteria) this;
        }

        public Criteria andSubmitedTimeGreaterThan(Date value) {
            addCriterion("SUBMITED_TIME >", value, "submitedTime");
            return (Criteria) this;
        }

        public Criteria andSubmitedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("SUBMITED_TIME >=", value, "submitedTime");
            return (Criteria) this;
        }

        public Criteria andSubmitedTimeLessThan(Date value) {
            addCriterion("SUBMITED_TIME <", value, "submitedTime");
            return (Criteria) this;
        }

        public Criteria andSubmitedTimeLessThanOrEqualTo(Date value) {
            addCriterion("SUBMITED_TIME <=", value, "submitedTime");
            return (Criteria) this;
        }

        public Criteria andSubmitedTimeIn(List<Date> values) {
            addCriterion("SUBMITED_TIME in", values, "submitedTime");
            return (Criteria) this;
        }

        public Criteria andSubmitedTimeNotIn(List<Date> values) {
            addCriterion("SUBMITED_TIME not in", values, "submitedTime");
            return (Criteria) this;
        }

        public Criteria andSubmitedTimeBetween(Date value1, Date value2) {
            addCriterion("SUBMITED_TIME between", value1, value2, "submitedTime");
            return (Criteria) this;
        }

        public Criteria andSubmitedTimeNotBetween(Date value1, Date value2) {
            addCriterion("SUBMITED_TIME not between", value1, value2, "submitedTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeIsNull() {
            addCriterion("PAID_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPaidTimeIsNotNull() {
            addCriterion("PAID_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPaidTimeEqualTo(Date value) {
            addCriterion("PAID_TIME =", value, "paidTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeNotEqualTo(Date value) {
            addCriterion("PAID_TIME <>", value, "paidTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeGreaterThan(Date value) {
            addCriterion("PAID_TIME >", value, "paidTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PAID_TIME >=", value, "paidTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeLessThan(Date value) {
            addCriterion("PAID_TIME <", value, "paidTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeLessThanOrEqualTo(Date value) {
            addCriterion("PAID_TIME <=", value, "paidTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeIn(List<Date> values) {
            addCriterion("PAID_TIME in", values, "paidTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeNotIn(List<Date> values) {
            addCriterion("PAID_TIME not in", values, "paidTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeBetween(Date value1, Date value2) {
            addCriterion("PAID_TIME between", value1, value2, "paidTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeNotBetween(Date value1, Date value2) {
            addCriterion("PAID_TIME not between", value1, value2, "paidTime");
            return (Criteria) this;
        }

        public Criteria andSampledTimeIsNull() {
            addCriterion("SAMPLED_TIME is null");
            return (Criteria) this;
        }

        public Criteria andSampledTimeIsNotNull() {
            addCriterion("SAMPLED_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andSampledTimeEqualTo(Date value) {
            addCriterion("SAMPLED_TIME =", value, "sampledTime");
            return (Criteria) this;
        }

        public Criteria andSampledTimeNotEqualTo(Date value) {
            addCriterion("SAMPLED_TIME <>", value, "sampledTime");
            return (Criteria) this;
        }

        public Criteria andSampledTimeGreaterThan(Date value) {
            addCriterion("SAMPLED_TIME >", value, "sampledTime");
            return (Criteria) this;
        }

        public Criteria andSampledTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("SAMPLED_TIME >=", value, "sampledTime");
            return (Criteria) this;
        }

        public Criteria andSampledTimeLessThan(Date value) {
            addCriterion("SAMPLED_TIME <", value, "sampledTime");
            return (Criteria) this;
        }

        public Criteria andSampledTimeLessThanOrEqualTo(Date value) {
            addCriterion("SAMPLED_TIME <=", value, "sampledTime");
            return (Criteria) this;
        }

        public Criteria andSampledTimeIn(List<Date> values) {
            addCriterion("SAMPLED_TIME in", values, "sampledTime");
            return (Criteria) this;
        }

        public Criteria andSampledTimeNotIn(List<Date> values) {
            addCriterion("SAMPLED_TIME not in", values, "sampledTime");
            return (Criteria) this;
        }

        public Criteria andSampledTimeBetween(Date value1, Date value2) {
            addCriterion("SAMPLED_TIME between", value1, value2, "sampledTime");
            return (Criteria) this;
        }

        public Criteria andSampledTimeNotBetween(Date value1, Date value2) {
            addCriterion("SAMPLED_TIME not between", value1, value2, "sampledTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeIsNull() {
            addCriterion("SEND_TIME is null");
            return (Criteria) this;
        }

        public Criteria andSendTimeIsNotNull() {
            addCriterion("SEND_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andSendTimeEqualTo(Date value) {
            addCriterion("SEND_TIME =", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotEqualTo(Date value) {
            addCriterion("SEND_TIME <>", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeGreaterThan(Date value) {
            addCriterion("SEND_TIME >", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("SEND_TIME >=", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLessThan(Date value) {
            addCriterion("SEND_TIME <", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLessThanOrEqualTo(Date value) {
            addCriterion("SEND_TIME <=", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeIn(List<Date> values) {
            addCriterion("SEND_TIME in", values, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotIn(List<Date> values) {
            addCriterion("SEND_TIME not in", values, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeBetween(Date value1, Date value2) {
            addCriterion("SEND_TIME between", value1, value2, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotBetween(Date value1, Date value2) {
            addCriterion("SEND_TIME not between", value1, value2, "sendTime");
            return (Criteria) this;
        }

        public Criteria andReceiptedTimeIsNull() {
            addCriterion("RECEIPTED_TIME is null");
            return (Criteria) this;
        }

        public Criteria andReceiptedTimeIsNotNull() {
            addCriterion("RECEIPTED_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptedTimeEqualTo(Date value) {
            addCriterion("RECEIPTED_TIME =", value, "receiptedTime");
            return (Criteria) this;
        }

        public Criteria andReceiptedTimeNotEqualTo(Date value) {
            addCriterion("RECEIPTED_TIME <>", value, "receiptedTime");
            return (Criteria) this;
        }

        public Criteria andReceiptedTimeGreaterThan(Date value) {
            addCriterion("RECEIPTED_TIME >", value, "receiptedTime");
            return (Criteria) this;
        }

        public Criteria andReceiptedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("RECEIPTED_TIME >=", value, "receiptedTime");
            return (Criteria) this;
        }

        public Criteria andReceiptedTimeLessThan(Date value) {
            addCriterion("RECEIPTED_TIME <", value, "receiptedTime");
            return (Criteria) this;
        }

        public Criteria andReceiptedTimeLessThanOrEqualTo(Date value) {
            addCriterion("RECEIPTED_TIME <=", value, "receiptedTime");
            return (Criteria) this;
        }

        public Criteria andReceiptedTimeIn(List<Date> values) {
            addCriterion("RECEIPTED_TIME in", values, "receiptedTime");
            return (Criteria) this;
        }

        public Criteria andReceiptedTimeNotIn(List<Date> values) {
            addCriterion("RECEIPTED_TIME not in", values, "receiptedTime");
            return (Criteria) this;
        }

        public Criteria andReceiptedTimeBetween(Date value1, Date value2) {
            addCriterion("RECEIPTED_TIME between", value1, value2, "receiptedTime");
            return (Criteria) this;
        }

        public Criteria andReceiptedTimeNotBetween(Date value1, Date value2) {
            addCriterion("RECEIPTED_TIME not between", value1, value2, "receiptedTime");
            return (Criteria) this;
        }

        public Criteria andTestedTimeIsNull() {
            addCriterion("TESTED_TIME is null");
            return (Criteria) this;
        }

        public Criteria andTestedTimeIsNotNull() {
            addCriterion("TESTED_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andTestedTimeEqualTo(Date value) {
            addCriterion("TESTED_TIME =", value, "testedTime");
            return (Criteria) this;
        }

        public Criteria andTestedTimeNotEqualTo(Date value) {
            addCriterion("TESTED_TIME <>", value, "testedTime");
            return (Criteria) this;
        }

        public Criteria andTestedTimeGreaterThan(Date value) {
            addCriterion("TESTED_TIME >", value, "testedTime");
            return (Criteria) this;
        }

        public Criteria andTestedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("TESTED_TIME >=", value, "testedTime");
            return (Criteria) this;
        }

        public Criteria andTestedTimeLessThan(Date value) {
            addCriterion("TESTED_TIME <", value, "testedTime");
            return (Criteria) this;
        }

        public Criteria andTestedTimeLessThanOrEqualTo(Date value) {
            addCriterion("TESTED_TIME <=", value, "testedTime");
            return (Criteria) this;
        }

        public Criteria andTestedTimeIn(List<Date> values) {
            addCriterion("TESTED_TIME in", values, "testedTime");
            return (Criteria) this;
        }

        public Criteria andTestedTimeNotIn(List<Date> values) {
            addCriterion("TESTED_TIME not in", values, "testedTime");
            return (Criteria) this;
        }

        public Criteria andTestedTimeBetween(Date value1, Date value2) {
            addCriterion("TESTED_TIME between", value1, value2, "testedTime");
            return (Criteria) this;
        }

        public Criteria andTestedTimeNotBetween(Date value1, Date value2) {
            addCriterion("TESTED_TIME not between", value1, value2, "testedTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeIsNull() {
            addCriterion("REPORT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andReportTimeIsNotNull() {
            addCriterion("REPORT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andReportTimeEqualTo(Date value) {
            addCriterion("REPORT_TIME =", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeNotEqualTo(Date value) {
            addCriterion("REPORT_TIME <>", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeGreaterThan(Date value) {
            addCriterion("REPORT_TIME >", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("REPORT_TIME >=", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeLessThan(Date value) {
            addCriterion("REPORT_TIME <", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeLessThanOrEqualTo(Date value) {
            addCriterion("REPORT_TIME <=", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeIn(List<Date> values) {
            addCriterion("REPORT_TIME in", values, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeNotIn(List<Date> values) {
            addCriterion("REPORT_TIME not in", values, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeBetween(Date value1, Date value2) {
            addCriterion("REPORT_TIME between", value1, value2, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeNotBetween(Date value1, Date value2) {
            addCriterion("REPORT_TIME not between", value1, value2, "reportTime");
            return (Criteria) this;
        }

        public Criteria andInvoiceTimeIsNull() {
            addCriterion("INVOICE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTimeIsNotNull() {
            addCriterion("INVOICE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTimeEqualTo(Date value) {
            addCriterion("INVOICE_TIME =", value, "invoiceTime");
            return (Criteria) this;
        }

        public Criteria andInvoiceTimeNotEqualTo(Date value) {
            addCriterion("INVOICE_TIME <>", value, "invoiceTime");
            return (Criteria) this;
        }

        public Criteria andInvoiceTimeGreaterThan(Date value) {
            addCriterion("INVOICE_TIME >", value, "invoiceTime");
            return (Criteria) this;
        }

        public Criteria andInvoiceTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("INVOICE_TIME >=", value, "invoiceTime");
            return (Criteria) this;
        }

        public Criteria andInvoiceTimeLessThan(Date value) {
            addCriterion("INVOICE_TIME <", value, "invoiceTime");
            return (Criteria) this;
        }

        public Criteria andInvoiceTimeLessThanOrEqualTo(Date value) {
            addCriterion("INVOICE_TIME <=", value, "invoiceTime");
            return (Criteria) this;
        }

        public Criteria andInvoiceTimeIn(List<Date> values) {
            addCriterion("INVOICE_TIME in", values, "invoiceTime");
            return (Criteria) this;
        }

        public Criteria andInvoiceTimeNotIn(List<Date> values) {
            addCriterion("INVOICE_TIME not in", values, "invoiceTime");
            return (Criteria) this;
        }

        public Criteria andInvoiceTimeBetween(Date value1, Date value2) {
            addCriterion("INVOICE_TIME between", value1, value2, "invoiceTime");
            return (Criteria) this;
        }

        public Criteria andInvoiceTimeNotBetween(Date value1, Date value2) {
            addCriterion("INVOICE_TIME not between", value1, value2, "invoiceTime");
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