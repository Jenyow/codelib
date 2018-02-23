package entities.business;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderSampleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderSampleExample() {
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

        public Criteria andSampleIdIsNull() {
            addCriterion("SAMPLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andSampleIdIsNotNull() {
            addCriterion("SAMPLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSampleIdEqualTo(Integer value) {
            addCriterion("SAMPLE_ID =", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdNotEqualTo(Integer value) {
            addCriterion("SAMPLE_ID <>", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdGreaterThan(Integer value) {
            addCriterion("SAMPLE_ID >", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SAMPLE_ID >=", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdLessThan(Integer value) {
            addCriterion("SAMPLE_ID <", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdLessThanOrEqualTo(Integer value) {
            addCriterion("SAMPLE_ID <=", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdIn(List<Integer> values) {
            addCriterion("SAMPLE_ID in", values, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdNotIn(List<Integer> values) {
            addCriterion("SAMPLE_ID not in", values, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdBetween(Integer value1, Integer value2) {
            addCriterion("SAMPLE_ID between", value1, value2, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SAMPLE_ID not between", value1, value2, "sampleId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNull() {
            addCriterion("GOODS_ID is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("GOODS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Integer value) {
            addCriterion("GOODS_ID =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Integer value) {
            addCriterion("GOODS_ID <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Integer value) {
            addCriterion("GOODS_ID >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("GOODS_ID >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Integer value) {
            addCriterion("GOODS_ID <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("GOODS_ID <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Integer> values) {
            addCriterion("GOODS_ID in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Integer> values) {
            addCriterion("GOODS_ID not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("GOODS_ID between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("GOODS_ID not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andSampleCodeIsNull() {
            addCriterion("SAMPLE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andSampleCodeIsNotNull() {
            addCriterion("SAMPLE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andSampleCodeEqualTo(String value) {
            addCriterion("SAMPLE_CODE =", value, "sampleCode");
            return (Criteria) this;
        }

        public Criteria andSampleCodeNotEqualTo(String value) {
            addCriterion("SAMPLE_CODE <>", value, "sampleCode");
            return (Criteria) this;
        }

        public Criteria andSampleCodeGreaterThan(String value) {
            addCriterion("SAMPLE_CODE >", value, "sampleCode");
            return (Criteria) this;
        }

        public Criteria andSampleCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SAMPLE_CODE >=", value, "sampleCode");
            return (Criteria) this;
        }

        public Criteria andSampleCodeLessThan(String value) {
            addCriterion("SAMPLE_CODE <", value, "sampleCode");
            return (Criteria) this;
        }

        public Criteria andSampleCodeLessThanOrEqualTo(String value) {
            addCriterion("SAMPLE_CODE <=", value, "sampleCode");
            return (Criteria) this;
        }

        public Criteria andSampleCodeLike(String value) {
            addCriterion("SAMPLE_CODE like", value, "sampleCode");
            return (Criteria) this;
        }

        public Criteria andSampleCodeNotLike(String value) {
            addCriterion("SAMPLE_CODE not like", value, "sampleCode");
            return (Criteria) this;
        }

        public Criteria andSampleCodeIn(List<String> values) {
            addCriterion("SAMPLE_CODE in", values, "sampleCode");
            return (Criteria) this;
        }

        public Criteria andSampleCodeNotIn(List<String> values) {
            addCriterion("SAMPLE_CODE not in", values, "sampleCode");
            return (Criteria) this;
        }

        public Criteria andSampleCodeBetween(String value1, String value2) {
            addCriterion("SAMPLE_CODE between", value1, value2, "sampleCode");
            return (Criteria) this;
        }

        public Criteria andSampleCodeNotBetween(String value1, String value2) {
            addCriterion("SAMPLE_CODE not between", value1, value2, "sampleCode");
            return (Criteria) this;
        }

        public Criteria andIsInvalidIsNull() {
            addCriterion("IS_INVALID is null");
            return (Criteria) this;
        }

        public Criteria andIsInvalidIsNotNull() {
            addCriterion("IS_INVALID is not null");
            return (Criteria) this;
        }

        public Criteria andIsInvalidEqualTo(Boolean value) {
            addCriterion("IS_INVALID =", value, "isInvalid");
            return (Criteria) this;
        }

        public Criteria andIsInvalidNotEqualTo(Boolean value) {
            addCriterion("IS_INVALID <>", value, "isInvalid");
            return (Criteria) this;
        }

        public Criteria andIsInvalidGreaterThan(Boolean value) {
            addCriterion("IS_INVALID >", value, "isInvalid");
            return (Criteria) this;
        }

        public Criteria andIsInvalidGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IS_INVALID >=", value, "isInvalid");
            return (Criteria) this;
        }

        public Criteria andIsInvalidLessThan(Boolean value) {
            addCriterion("IS_INVALID <", value, "isInvalid");
            return (Criteria) this;
        }

        public Criteria andIsInvalidLessThanOrEqualTo(Boolean value) {
            addCriterion("IS_INVALID <=", value, "isInvalid");
            return (Criteria) this;
        }

        public Criteria andIsInvalidIn(List<Boolean> values) {
            addCriterion("IS_INVALID in", values, "isInvalid");
            return (Criteria) this;
        }

        public Criteria andIsInvalidNotIn(List<Boolean> values) {
            addCriterion("IS_INVALID not in", values, "isInvalid");
            return (Criteria) this;
        }

        public Criteria andIsInvalidBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_INVALID between", value1, value2, "isInvalid");
            return (Criteria) this;
        }

        public Criteria andIsInvalidNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_INVALID not between", value1, value2, "isInvalid");
            return (Criteria) this;
        }

        public Criteria andResampledReasonIsNull() {
            addCriterion("RESAMPLED_REASON is null");
            return (Criteria) this;
        }

        public Criteria andResampledReasonIsNotNull() {
            addCriterion("RESAMPLED_REASON is not null");
            return (Criteria) this;
        }

        public Criteria andResampledReasonEqualTo(String value) {
            addCriterion("RESAMPLED_REASON =", value, "resampledReason");
            return (Criteria) this;
        }

        public Criteria andResampledReasonNotEqualTo(String value) {
            addCriterion("RESAMPLED_REASON <>", value, "resampledReason");
            return (Criteria) this;
        }

        public Criteria andResampledReasonGreaterThan(String value) {
            addCriterion("RESAMPLED_REASON >", value, "resampledReason");
            return (Criteria) this;
        }

        public Criteria andResampledReasonGreaterThanOrEqualTo(String value) {
            addCriterion("RESAMPLED_REASON >=", value, "resampledReason");
            return (Criteria) this;
        }

        public Criteria andResampledReasonLessThan(String value) {
            addCriterion("RESAMPLED_REASON <", value, "resampledReason");
            return (Criteria) this;
        }

        public Criteria andResampledReasonLessThanOrEqualTo(String value) {
            addCriterion("RESAMPLED_REASON <=", value, "resampledReason");
            return (Criteria) this;
        }

        public Criteria andResampledReasonLike(String value) {
            addCriterion("RESAMPLED_REASON like", value, "resampledReason");
            return (Criteria) this;
        }

        public Criteria andResampledReasonNotLike(String value) {
            addCriterion("RESAMPLED_REASON not like", value, "resampledReason");
            return (Criteria) this;
        }

        public Criteria andResampledReasonIn(List<String> values) {
            addCriterion("RESAMPLED_REASON in", values, "resampledReason");
            return (Criteria) this;
        }

        public Criteria andResampledReasonNotIn(List<String> values) {
            addCriterion("RESAMPLED_REASON not in", values, "resampledReason");
            return (Criteria) this;
        }

        public Criteria andResampledReasonBetween(String value1, String value2) {
            addCriterion("RESAMPLED_REASON between", value1, value2, "resampledReason");
            return (Criteria) this;
        }

        public Criteria andResampledReasonNotBetween(String value1, String value2) {
            addCriterion("RESAMPLED_REASON not between", value1, value2, "resampledReason");
            return (Criteria) this;
        }

        public Criteria andIsResampledIsNull() {
            addCriterion("IS_RESAMPLED is null");
            return (Criteria) this;
        }

        public Criteria andIsResampledIsNotNull() {
            addCriterion("IS_RESAMPLED is not null");
            return (Criteria) this;
        }

        public Criteria andIsResampledEqualTo(Boolean value) {
            addCriterion("IS_RESAMPLED =", value, "isResampled");
            return (Criteria) this;
        }

        public Criteria andIsResampledNotEqualTo(Boolean value) {
            addCriterion("IS_RESAMPLED <>", value, "isResampled");
            return (Criteria) this;
        }

        public Criteria andIsResampledGreaterThan(Boolean value) {
            addCriterion("IS_RESAMPLED >", value, "isResampled");
            return (Criteria) this;
        }

        public Criteria andIsResampledGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IS_RESAMPLED >=", value, "isResampled");
            return (Criteria) this;
        }

        public Criteria andIsResampledLessThan(Boolean value) {
            addCriterion("IS_RESAMPLED <", value, "isResampled");
            return (Criteria) this;
        }

        public Criteria andIsResampledLessThanOrEqualTo(Boolean value) {
            addCriterion("IS_RESAMPLED <=", value, "isResampled");
            return (Criteria) this;
        }

        public Criteria andIsResampledIn(List<Boolean> values) {
            addCriterion("IS_RESAMPLED in", values, "isResampled");
            return (Criteria) this;
        }

        public Criteria andIsResampledNotIn(List<Boolean> values) {
            addCriterion("IS_RESAMPLED not in", values, "isResampled");
            return (Criteria) this;
        }

        public Criteria andIsResampledBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_RESAMPLED between", value1, value2, "isResampled");
            return (Criteria) this;
        }

        public Criteria andIsResampledNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_RESAMPLED not between", value1, value2, "isResampled");
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

        public Criteria andSampleCodeLikeInsensitive(String value) {
            addCriterion("upper(SAMPLE_CODE) like", value.toUpperCase(), "sampleCode");
            return (Criteria) this;
        }

        public Criteria andResampledReasonLikeInsensitive(String value) {
            addCriterion("upper(RESAMPLED_REASON) like", value.toUpperCase(), "resampledReason");
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