package entities.business;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderLogisticsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderLogisticsExample() {
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

        public Criteria andLogisticsIdIsNull() {
            addCriterion("LOGISTICS_ID is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsIdIsNotNull() {
            addCriterion("LOGISTICS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsIdEqualTo(Integer value) {
            addCriterion("LOGISTICS_ID =", value, "logisticsId");
            return (Criteria) this;
        }

        public Criteria andLogisticsIdNotEqualTo(Integer value) {
            addCriterion("LOGISTICS_ID <>", value, "logisticsId");
            return (Criteria) this;
        }

        public Criteria andLogisticsIdGreaterThan(Integer value) {
            addCriterion("LOGISTICS_ID >", value, "logisticsId");
            return (Criteria) this;
        }

        public Criteria andLogisticsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("LOGISTICS_ID >=", value, "logisticsId");
            return (Criteria) this;
        }

        public Criteria andLogisticsIdLessThan(Integer value) {
            addCriterion("LOGISTICS_ID <", value, "logisticsId");
            return (Criteria) this;
        }

        public Criteria andLogisticsIdLessThanOrEqualTo(Integer value) {
            addCriterion("LOGISTICS_ID <=", value, "logisticsId");
            return (Criteria) this;
        }

        public Criteria andLogisticsIdIn(List<Integer> values) {
            addCriterion("LOGISTICS_ID in", values, "logisticsId");
            return (Criteria) this;
        }

        public Criteria andLogisticsIdNotIn(List<Integer> values) {
            addCriterion("LOGISTICS_ID not in", values, "logisticsId");
            return (Criteria) this;
        }

        public Criteria andLogisticsIdBetween(Integer value1, Integer value2) {
            addCriterion("LOGISTICS_ID between", value1, value2, "logisticsId");
            return (Criteria) this;
        }

        public Criteria andLogisticsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("LOGISTICS_ID not between", value1, value2, "logisticsId");
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

        public Criteria andOrderCodeIsNull() {
            addCriterion("ORDER_CODE is null");
            return (Criteria) this;
        }

        public Criteria andOrderCodeIsNotNull() {
            addCriterion("ORDER_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCodeEqualTo(String value) {
            addCriterion("ORDER_CODE =", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotEqualTo(String value) {
            addCriterion("ORDER_CODE <>", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeGreaterThan(String value) {
            addCriterion("ORDER_CODE >", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_CODE >=", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLessThan(String value) {
            addCriterion("ORDER_CODE <", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLessThanOrEqualTo(String value) {
            addCriterion("ORDER_CODE <=", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLike(String value) {
            addCriterion("ORDER_CODE like", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotLike(String value) {
            addCriterion("ORDER_CODE not like", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeIn(List<String> values) {
            addCriterion("ORDER_CODE in", values, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotIn(List<String> values) {
            addCriterion("ORDER_CODE not in", values, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeBetween(String value1, String value2) {
            addCriterion("ORDER_CODE between", value1, value2, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotBetween(String value1, String value2) {
            addCriterion("ORDER_CODE not between", value1, value2, "orderCode");
            return (Criteria) this;
        }

        public Criteria andLogisticsCodeIsNull() {
            addCriterion("LOGISTICS_CODE is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsCodeIsNotNull() {
            addCriterion("LOGISTICS_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsCodeEqualTo(String value) {
            addCriterion("LOGISTICS_CODE =", value, "logisticsCode");
            return (Criteria) this;
        }

        public Criteria andLogisticsCodeNotEqualTo(String value) {
            addCriterion("LOGISTICS_CODE <>", value, "logisticsCode");
            return (Criteria) this;
        }

        public Criteria andLogisticsCodeGreaterThan(String value) {
            addCriterion("LOGISTICS_CODE >", value, "logisticsCode");
            return (Criteria) this;
        }

        public Criteria andLogisticsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("LOGISTICS_CODE >=", value, "logisticsCode");
            return (Criteria) this;
        }

        public Criteria andLogisticsCodeLessThan(String value) {
            addCriterion("LOGISTICS_CODE <", value, "logisticsCode");
            return (Criteria) this;
        }

        public Criteria andLogisticsCodeLessThanOrEqualTo(String value) {
            addCriterion("LOGISTICS_CODE <=", value, "logisticsCode");
            return (Criteria) this;
        }

        public Criteria andLogisticsCodeLike(String value) {
            addCriterion("LOGISTICS_CODE like", value, "logisticsCode");
            return (Criteria) this;
        }

        public Criteria andLogisticsCodeNotLike(String value) {
            addCriterion("LOGISTICS_CODE not like", value, "logisticsCode");
            return (Criteria) this;
        }

        public Criteria andLogisticsCodeIn(List<String> values) {
            addCriterion("LOGISTICS_CODE in", values, "logisticsCode");
            return (Criteria) this;
        }

        public Criteria andLogisticsCodeNotIn(List<String> values) {
            addCriterion("LOGISTICS_CODE not in", values, "logisticsCode");
            return (Criteria) this;
        }

        public Criteria andLogisticsCodeBetween(String value1, String value2) {
            addCriterion("LOGISTICS_CODE between", value1, value2, "logisticsCode");
            return (Criteria) this;
        }

        public Criteria andLogisticsCodeNotBetween(String value1, String value2) {
            addCriterion("LOGISTICS_CODE not between", value1, value2, "logisticsCode");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("AMOUNT =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("AMOUNT <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("AMOUNT >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMOUNT >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("AMOUNT <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMOUNT <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("AMOUNT in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("AMOUNT not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMOUNT between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMOUNT not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andExpressIdIsNull() {
            addCriterion("EXPRESS_ID is null");
            return (Criteria) this;
        }

        public Criteria andExpressIdIsNotNull() {
            addCriterion("EXPRESS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andExpressIdEqualTo(String value) {
            addCriterion("EXPRESS_ID =", value, "expressId");
            return (Criteria) this;
        }

        public Criteria andExpressIdNotEqualTo(String value) {
            addCriterion("EXPRESS_ID <>", value, "expressId");
            return (Criteria) this;
        }

        public Criteria andExpressIdGreaterThan(String value) {
            addCriterion("EXPRESS_ID >", value, "expressId");
            return (Criteria) this;
        }

        public Criteria andExpressIdGreaterThanOrEqualTo(String value) {
            addCriterion("EXPRESS_ID >=", value, "expressId");
            return (Criteria) this;
        }

        public Criteria andExpressIdLessThan(String value) {
            addCriterion("EXPRESS_ID <", value, "expressId");
            return (Criteria) this;
        }

        public Criteria andExpressIdLessThanOrEqualTo(String value) {
            addCriterion("EXPRESS_ID <=", value, "expressId");
            return (Criteria) this;
        }

        public Criteria andExpressIdLike(String value) {
            addCriterion("EXPRESS_ID like", value, "expressId");
            return (Criteria) this;
        }

        public Criteria andExpressIdNotLike(String value) {
            addCriterion("EXPRESS_ID not like", value, "expressId");
            return (Criteria) this;
        }

        public Criteria andExpressIdIn(List<String> values) {
            addCriterion("EXPRESS_ID in", values, "expressId");
            return (Criteria) this;
        }

        public Criteria andExpressIdNotIn(List<String> values) {
            addCriterion("EXPRESS_ID not in", values, "expressId");
            return (Criteria) this;
        }

        public Criteria andExpressIdBetween(String value1, String value2) {
            addCriterion("EXPRESS_ID between", value1, value2, "expressId");
            return (Criteria) this;
        }

        public Criteria andExpressIdNotBetween(String value1, String value2) {
            addCriterion("EXPRESS_ID not between", value1, value2, "expressId");
            return (Criteria) this;
        }

        public Criteria andExpressNameIsNull() {
            addCriterion("EXPRESS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andExpressNameIsNotNull() {
            addCriterion("EXPRESS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andExpressNameEqualTo(String value) {
            addCriterion("EXPRESS_NAME =", value, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressNameNotEqualTo(String value) {
            addCriterion("EXPRESS_NAME <>", value, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressNameGreaterThan(String value) {
            addCriterion("EXPRESS_NAME >", value, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressNameGreaterThanOrEqualTo(String value) {
            addCriterion("EXPRESS_NAME >=", value, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressNameLessThan(String value) {
            addCriterion("EXPRESS_NAME <", value, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressNameLessThanOrEqualTo(String value) {
            addCriterion("EXPRESS_NAME <=", value, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressNameLike(String value) {
            addCriterion("EXPRESS_NAME like", value, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressNameNotLike(String value) {
            addCriterion("EXPRESS_NAME not like", value, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressNameIn(List<String> values) {
            addCriterion("EXPRESS_NAME in", values, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressNameNotIn(List<String> values) {
            addCriterion("EXPRESS_NAME not in", values, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressNameBetween(String value1, String value2) {
            addCriterion("EXPRESS_NAME between", value1, value2, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressNameNotBetween(String value1, String value2) {
            addCriterion("EXPRESS_NAME not between", value1, value2, "expressName");
            return (Criteria) this;
        }

        public Criteria andIsReceivedIsNull() {
            addCriterion("IS_RECEIVED is null");
            return (Criteria) this;
        }

        public Criteria andIsReceivedIsNotNull() {
            addCriterion("IS_RECEIVED is not null");
            return (Criteria) this;
        }

        public Criteria andIsReceivedEqualTo(Short value) {
            addCriterion("IS_RECEIVED =", value, "isReceived");
            return (Criteria) this;
        }

        public Criteria andIsReceivedNotEqualTo(Short value) {
            addCriterion("IS_RECEIVED <>", value, "isReceived");
            return (Criteria) this;
        }

        public Criteria andIsReceivedGreaterThan(Short value) {
            addCriterion("IS_RECEIVED >", value, "isReceived");
            return (Criteria) this;
        }

        public Criteria andIsReceivedGreaterThanOrEqualTo(Short value) {
            addCriterion("IS_RECEIVED >=", value, "isReceived");
            return (Criteria) this;
        }

        public Criteria andIsReceivedLessThan(Short value) {
            addCriterion("IS_RECEIVED <", value, "isReceived");
            return (Criteria) this;
        }

        public Criteria andIsReceivedLessThanOrEqualTo(Short value) {
            addCriterion("IS_RECEIVED <=", value, "isReceived");
            return (Criteria) this;
        }

        public Criteria andIsReceivedIn(List<Short> values) {
            addCriterion("IS_RECEIVED in", values, "isReceived");
            return (Criteria) this;
        }

        public Criteria andIsReceivedNotIn(List<Short> values) {
            addCriterion("IS_RECEIVED not in", values, "isReceived");
            return (Criteria) this;
        }

        public Criteria andIsReceivedBetween(Short value1, Short value2) {
            addCriterion("IS_RECEIVED between", value1, value2, "isReceived");
            return (Criteria) this;
        }

        public Criteria andIsReceivedNotBetween(Short value1, Short value2) {
            addCriterion("IS_RECEIVED not between", value1, value2, "isReceived");
            return (Criteria) this;
        }

        public Criteria andReceivedTimeIsNull() {
            addCriterion("RECEIVED_TIME is null");
            return (Criteria) this;
        }

        public Criteria andReceivedTimeIsNotNull() {
            addCriterion("RECEIVED_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andReceivedTimeEqualTo(Date value) {
            addCriterion("RECEIVED_TIME =", value, "receivedTime");
            return (Criteria) this;
        }

        public Criteria andReceivedTimeNotEqualTo(Date value) {
            addCriterion("RECEIVED_TIME <>", value, "receivedTime");
            return (Criteria) this;
        }

        public Criteria andReceivedTimeGreaterThan(Date value) {
            addCriterion("RECEIVED_TIME >", value, "receivedTime");
            return (Criteria) this;
        }

        public Criteria andReceivedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("RECEIVED_TIME >=", value, "receivedTime");
            return (Criteria) this;
        }

        public Criteria andReceivedTimeLessThan(Date value) {
            addCriterion("RECEIVED_TIME <", value, "receivedTime");
            return (Criteria) this;
        }

        public Criteria andReceivedTimeLessThanOrEqualTo(Date value) {
            addCriterion("RECEIVED_TIME <=", value, "receivedTime");
            return (Criteria) this;
        }

        public Criteria andReceivedTimeIn(List<Date> values) {
            addCriterion("RECEIVED_TIME in", values, "receivedTime");
            return (Criteria) this;
        }

        public Criteria andReceivedTimeNotIn(List<Date> values) {
            addCriterion("RECEIVED_TIME not in", values, "receivedTime");
            return (Criteria) this;
        }

        public Criteria andReceivedTimeBetween(Date value1, Date value2) {
            addCriterion("RECEIVED_TIME between", value1, value2, "receivedTime");
            return (Criteria) this;
        }

        public Criteria andReceivedTimeNotBetween(Date value1, Date value2) {
            addCriterion("RECEIVED_TIME not between", value1, value2, "receivedTime");
            return (Criteria) this;
        }

        public Criteria andReceivedUseridIsNull() {
            addCriterion("RECEIVED_USERID is null");
            return (Criteria) this;
        }

        public Criteria andReceivedUseridIsNotNull() {
            addCriterion("RECEIVED_USERID is not null");
            return (Criteria) this;
        }

        public Criteria andReceivedUseridEqualTo(String value) {
            addCriterion("RECEIVED_USERID =", value, "receivedUserid");
            return (Criteria) this;
        }

        public Criteria andReceivedUseridNotEqualTo(String value) {
            addCriterion("RECEIVED_USERID <>", value, "receivedUserid");
            return (Criteria) this;
        }

        public Criteria andReceivedUseridGreaterThan(String value) {
            addCriterion("RECEIVED_USERID >", value, "receivedUserid");
            return (Criteria) this;
        }

        public Criteria andReceivedUseridGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVED_USERID >=", value, "receivedUserid");
            return (Criteria) this;
        }

        public Criteria andReceivedUseridLessThan(String value) {
            addCriterion("RECEIVED_USERID <", value, "receivedUserid");
            return (Criteria) this;
        }

        public Criteria andReceivedUseridLessThanOrEqualTo(String value) {
            addCriterion("RECEIVED_USERID <=", value, "receivedUserid");
            return (Criteria) this;
        }

        public Criteria andReceivedUseridLike(String value) {
            addCriterion("RECEIVED_USERID like", value, "receivedUserid");
            return (Criteria) this;
        }

        public Criteria andReceivedUseridNotLike(String value) {
            addCriterion("RECEIVED_USERID not like", value, "receivedUserid");
            return (Criteria) this;
        }

        public Criteria andReceivedUseridIn(List<String> values) {
            addCriterion("RECEIVED_USERID in", values, "receivedUserid");
            return (Criteria) this;
        }

        public Criteria andReceivedUseridNotIn(List<String> values) {
            addCriterion("RECEIVED_USERID not in", values, "receivedUserid");
            return (Criteria) this;
        }

        public Criteria andReceivedUseridBetween(String value1, String value2) {
            addCriterion("RECEIVED_USERID between", value1, value2, "receivedUserid");
            return (Criteria) this;
        }

        public Criteria andReceivedUseridNotBetween(String value1, String value2) {
            addCriterion("RECEIVED_USERID not between", value1, value2, "receivedUserid");
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

        public Criteria andOrderCodeLikeInsensitive(String value) {
            addCriterion("upper(ORDER_CODE) like", value.toUpperCase(), "orderCode");
            return (Criteria) this;
        }

        public Criteria andLogisticsCodeLikeInsensitive(String value) {
            addCriterion("upper(LOGISTICS_CODE) like", value.toUpperCase(), "logisticsCode");
            return (Criteria) this;
        }

        public Criteria andExpressIdLikeInsensitive(String value) {
            addCriterion("upper(EXPRESS_ID) like", value.toUpperCase(), "expressId");
            return (Criteria) this;
        }

        public Criteria andExpressNameLikeInsensitive(String value) {
            addCriterion("upper(EXPRESS_NAME) like", value.toUpperCase(), "expressName");
            return (Criteria) this;
        }

        public Criteria andReceivedUseridLikeInsensitive(String value) {
            addCriterion("upper(RECEIVED_USERID) like", value.toUpperCase(), "receivedUserid");
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