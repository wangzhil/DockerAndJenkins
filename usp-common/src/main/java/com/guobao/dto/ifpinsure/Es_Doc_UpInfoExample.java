package com.guobao.dto.ifpinsure;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.Iterator;

public class Es_Doc_UpInfoExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table es_doc_upinfo
	 * @mbg.generated  Mon Jan 14 14:35:27 CST 2019
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table es_doc_upinfo
	 * @mbg.generated  Mon Jan 14 14:35:27 CST 2019
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table es_doc_upinfo
	 * @mbg.generated  Mon Jan 14 14:35:27 CST 2019
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table es_doc_upinfo
	 * @mbg.generated  Mon Jan 14 14:35:27 CST 2019
	 */
	public Es_Doc_UpInfoExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table es_doc_upinfo
	 * @mbg.generated  Mon Jan 14 14:35:27 CST 2019
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table es_doc_upinfo
	 * @mbg.generated  Mon Jan 14 14:35:27 CST 2019
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table es_doc_upinfo
	 * @mbg.generated  Mon Jan 14 14:35:27 CST 2019
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table es_doc_upinfo
	 * @mbg.generated  Mon Jan 14 14:35:27 CST 2019
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table es_doc_upinfo
	 * @mbg.generated  Mon Jan 14 14:35:27 CST 2019
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table es_doc_upinfo
	 * @mbg.generated  Mon Jan 14 14:35:27 CST 2019
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table es_doc_upinfo
	 * @mbg.generated  Mon Jan 14 14:35:27 CST 2019
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table es_doc_upinfo
	 * @mbg.generated  Mon Jan 14 14:35:27 CST 2019
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table es_doc_upinfo
	 * @mbg.generated  Mon Jan 14 14:35:27 CST 2019
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table es_doc_upinfo
	 * @mbg.generated  Mon Jan 14 14:35:27 CST 2019
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table es_doc_upinfo
	 * @mbg.generated  Mon Jan 14 14:35:27 CST 2019
	 */
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

		public Criteria andKeystrIsNull() {
			addCriterion("KEYSTR is null");
			return (Criteria) this;
		}

		public Criteria andKeystrIsNotNull() {
			addCriterion("KEYSTR is not null");
			return (Criteria) this;
		}

		public Criteria andKeystrEqualTo(String value) {
			addCriterion("KEYSTR =", value, "keystr");
			return (Criteria) this;
		}

		public Criteria andKeystrNotEqualTo(String value) {
			addCriterion("KEYSTR <>", value, "keystr");
			return (Criteria) this;
		}

		public Criteria andKeystrGreaterThan(String value) {
			addCriterion("KEYSTR >", value, "keystr");
			return (Criteria) this;
		}

		public Criteria andKeystrGreaterThanOrEqualTo(String value) {
			addCriterion("KEYSTR >=", value, "keystr");
			return (Criteria) this;
		}

		public Criteria andKeystrLessThan(String value) {
			addCriterion("KEYSTR <", value, "keystr");
			return (Criteria) this;
		}

		public Criteria andKeystrLessThanOrEqualTo(String value) {
			addCriterion("KEYSTR <=", value, "keystr");
			return (Criteria) this;
		}

		public Criteria andKeystrLike(String value) {
			addCriterion("KEYSTR like", value, "keystr");
			return (Criteria) this;
		}

		public Criteria andKeystrNotLike(String value) {
			addCriterion("KEYSTR not like", value, "keystr");
			return (Criteria) this;
		}

		public Criteria andKeystrIn(List<String> values) {
			addCriterion("KEYSTR in", values, "keystr");
			return (Criteria) this;
		}

		public Criteria andKeystrNotIn(List<String> values) {
			addCriterion("KEYSTR not in", values, "keystr");
			return (Criteria) this;
		}

		public Criteria andKeystrBetween(String value1, String value2) {
			addCriterion("KEYSTR between", value1, value2, "keystr");
			return (Criteria) this;
		}

		public Criteria andKeystrNotBetween(String value1, String value2) {
			addCriterion("KEYSTR not between", value1, value2, "keystr");
			return (Criteria) this;
		}

		public Criteria andBussnotypeIsNull() {
			addCriterion("BUSSNOTYPE is null");
			return (Criteria) this;
		}

		public Criteria andBussnotypeIsNotNull() {
			addCriterion("BUSSNOTYPE is not null");
			return (Criteria) this;
		}

		public Criteria andBussnotypeEqualTo(String value) {
			addCriterion("BUSSNOTYPE =", value, "bussnotype");
			return (Criteria) this;
		}

		public Criteria andBussnotypeNotEqualTo(String value) {
			addCriterion("BUSSNOTYPE <>", value, "bussnotype");
			return (Criteria) this;
		}

		public Criteria andBussnotypeGreaterThan(String value) {
			addCriterion("BUSSNOTYPE >", value, "bussnotype");
			return (Criteria) this;
		}

		public Criteria andBussnotypeGreaterThanOrEqualTo(String value) {
			addCriterion("BUSSNOTYPE >=", value, "bussnotype");
			return (Criteria) this;
		}

		public Criteria andBussnotypeLessThan(String value) {
			addCriterion("BUSSNOTYPE <", value, "bussnotype");
			return (Criteria) this;
		}

		public Criteria andBussnotypeLessThanOrEqualTo(String value) {
			addCriterion("BUSSNOTYPE <=", value, "bussnotype");
			return (Criteria) this;
		}

		public Criteria andBussnotypeLike(String value) {
			addCriterion("BUSSNOTYPE like", value, "bussnotype");
			return (Criteria) this;
		}

		public Criteria andBussnotypeNotLike(String value) {
			addCriterion("BUSSNOTYPE not like", value, "bussnotype");
			return (Criteria) this;
		}

		public Criteria andBussnotypeIn(List<String> values) {
			addCriterion("BUSSNOTYPE in", values, "bussnotype");
			return (Criteria) this;
		}

		public Criteria andBussnotypeNotIn(List<String> values) {
			addCriterion("BUSSNOTYPE not in", values, "bussnotype");
			return (Criteria) this;
		}

		public Criteria andBussnotypeBetween(String value1, String value2) {
			addCriterion("BUSSNOTYPE between", value1, value2, "bussnotype");
			return (Criteria) this;
		}

		public Criteria andBussnotypeNotBetween(String value1, String value2) {
			addCriterion("BUSSNOTYPE not between", value1, value2, "bussnotype");
			return (Criteria) this;
		}

		public Criteria andBussnoIsNull() {
			addCriterion("BUSSNO is null");
			return (Criteria) this;
		}

		public Criteria andBussnoIsNotNull() {
			addCriterion("BUSSNO is not null");
			return (Criteria) this;
		}

		public Criteria andBussnoEqualTo(String value) {
			addCriterion("BUSSNO =", value, "bussno");
			return (Criteria) this;
		}

		public Criteria andBussnoNotEqualTo(String value) {
			addCriterion("BUSSNO <>", value, "bussno");
			return (Criteria) this;
		}

		public Criteria andBussnoGreaterThan(String value) {
			addCriterion("BUSSNO >", value, "bussno");
			return (Criteria) this;
		}

		public Criteria andBussnoGreaterThanOrEqualTo(String value) {
			addCriterion("BUSSNO >=", value, "bussno");
			return (Criteria) this;
		}

		public Criteria andBussnoLessThan(String value) {
			addCriterion("BUSSNO <", value, "bussno");
			return (Criteria) this;
		}

		public Criteria andBussnoLessThanOrEqualTo(String value) {
			addCriterion("BUSSNO <=", value, "bussno");
			return (Criteria) this;
		}

		public Criteria andBussnoLike(String value) {
			addCriterion("BUSSNO like", value, "bussno");
			return (Criteria) this;
		}

		public Criteria andBussnoNotLike(String value) {
			addCriterion("BUSSNO not like", value, "bussno");
			return (Criteria) this;
		}

		public Criteria andBussnoIn(List<String> values) {
			addCriterion("BUSSNO in", values, "bussno");
			return (Criteria) this;
		}

		public Criteria andBussnoNotIn(List<String> values) {
			addCriterion("BUSSNO not in", values, "bussno");
			return (Criteria) this;
		}

		public Criteria andBussnoBetween(String value1, String value2) {
			addCriterion("BUSSNO between", value1, value2, "bussno");
			return (Criteria) this;
		}

		public Criteria andBussnoNotBetween(String value1, String value2) {
			addCriterion("BUSSNO not between", value1, value2, "bussno");
			return (Criteria) this;
		}

		public Criteria andCertifycodeIsNull() {
			addCriterion("CERTIFYCODE is null");
			return (Criteria) this;
		}

		public Criteria andCertifycodeIsNotNull() {
			addCriterion("CERTIFYCODE is not null");
			return (Criteria) this;
		}

		public Criteria andCertifycodeEqualTo(String value) {
			addCriterion("CERTIFYCODE =", value, "certifycode");
			return (Criteria) this;
		}

		public Criteria andCertifycodeNotEqualTo(String value) {
			addCriterion("CERTIFYCODE <>", value, "certifycode");
			return (Criteria) this;
		}

		public Criteria andCertifycodeGreaterThan(String value) {
			addCriterion("CERTIFYCODE >", value, "certifycode");
			return (Criteria) this;
		}

		public Criteria andCertifycodeGreaterThanOrEqualTo(String value) {
			addCriterion("CERTIFYCODE >=", value, "certifycode");
			return (Criteria) this;
		}

		public Criteria andCertifycodeLessThan(String value) {
			addCriterion("CERTIFYCODE <", value, "certifycode");
			return (Criteria) this;
		}

		public Criteria andCertifycodeLessThanOrEqualTo(String value) {
			addCriterion("CERTIFYCODE <=", value, "certifycode");
			return (Criteria) this;
		}

		public Criteria andCertifycodeLike(String value) {
			addCriterion("CERTIFYCODE like", value, "certifycode");
			return (Criteria) this;
		}

		public Criteria andCertifycodeNotLike(String value) {
			addCriterion("CERTIFYCODE not like", value, "certifycode");
			return (Criteria) this;
		}

		public Criteria andCertifycodeIn(List<String> values) {
			addCriterion("CERTIFYCODE in", values, "certifycode");
			return (Criteria) this;
		}

		public Criteria andCertifycodeNotIn(List<String> values) {
			addCriterion("CERTIFYCODE not in", values, "certifycode");
			return (Criteria) this;
		}

		public Criteria andCertifycodeBetween(String value1, String value2) {
			addCriterion("CERTIFYCODE between", value1, value2, "certifycode");
			return (Criteria) this;
		}

		public Criteria andCertifycodeNotBetween(String value1, String value2) {
			addCriterion("CERTIFYCODE not between", value1, value2, "certifycode");
			return (Criteria) this;
		}

		public Criteria andOrdernoIsNull() {
			addCriterion("OrderNo is null");
			return (Criteria) this;
		}

		public Criteria andOrdernoIsNotNull() {
			addCriterion("OrderNo is not null");
			return (Criteria) this;
		}

		public Criteria andOrdernoEqualTo(Integer value) {
			addCriterion("OrderNo =", value, "orderno");
			return (Criteria) this;
		}

		public Criteria andOrdernoNotEqualTo(Integer value) {
			addCriterion("OrderNo <>", value, "orderno");
			return (Criteria) this;
		}

		public Criteria andOrdernoGreaterThan(Integer value) {
			addCriterion("OrderNo >", value, "orderno");
			return (Criteria) this;
		}

		public Criteria andOrdernoGreaterThanOrEqualTo(Integer value) {
			addCriterion("OrderNo >=", value, "orderno");
			return (Criteria) this;
		}

		public Criteria andOrdernoLessThan(Integer value) {
			addCriterion("OrderNo <", value, "orderno");
			return (Criteria) this;
		}

		public Criteria andOrdernoLessThanOrEqualTo(Integer value) {
			addCriterion("OrderNo <=", value, "orderno");
			return (Criteria) this;
		}

		public Criteria andOrdernoIn(List<Integer> values) {
			addCriterion("OrderNo in", values, "orderno");
			return (Criteria) this;
		}

		public Criteria andOrdernoNotIn(List<Integer> values) {
			addCriterion("OrderNo not in", values, "orderno");
			return (Criteria) this;
		}

		public Criteria andOrdernoBetween(Integer value1, Integer value2) {
			addCriterion("OrderNo between", value1, value2, "orderno");
			return (Criteria) this;
		}

		public Criteria andOrdernoNotBetween(Integer value1, Integer value2) {
			addCriterion("OrderNo not between", value1, value2, "orderno");
			return (Criteria) this;
		}

		public Criteria andTolisflagIsNull() {
			addCriterion("ToLisFlag is null");
			return (Criteria) this;
		}

		public Criteria andTolisflagIsNotNull() {
			addCriterion("ToLisFlag is not null");
			return (Criteria) this;
		}

		public Criteria andTolisflagEqualTo(String value) {
			addCriterion("ToLisFlag =", value, "tolisflag");
			return (Criteria) this;
		}

		public Criteria andTolisflagNotEqualTo(String value) {
			addCriterion("ToLisFlag <>", value, "tolisflag");
			return (Criteria) this;
		}

		public Criteria andTolisflagGreaterThan(String value) {
			addCriterion("ToLisFlag >", value, "tolisflag");
			return (Criteria) this;
		}

		public Criteria andTolisflagGreaterThanOrEqualTo(String value) {
			addCriterion("ToLisFlag >=", value, "tolisflag");
			return (Criteria) this;
		}

		public Criteria andTolisflagLessThan(String value) {
			addCriterion("ToLisFlag <", value, "tolisflag");
			return (Criteria) this;
		}

		public Criteria andTolisflagLessThanOrEqualTo(String value) {
			addCriterion("ToLisFlag <=", value, "tolisflag");
			return (Criteria) this;
		}

		public Criteria andTolisflagLike(String value) {
			addCriterion("ToLisFlag like", value, "tolisflag");
			return (Criteria) this;
		}

		public Criteria andTolisflagNotLike(String value) {
			addCriterion("ToLisFlag not like", value, "tolisflag");
			return (Criteria) this;
		}

		public Criteria andTolisflagIn(List<String> values) {
			addCriterion("ToLisFlag in", values, "tolisflag");
			return (Criteria) this;
		}

		public Criteria andTolisflagNotIn(List<String> values) {
			addCriterion("ToLisFlag not in", values, "tolisflag");
			return (Criteria) this;
		}

		public Criteria andTolisflagBetween(String value1, String value2) {
			addCriterion("ToLisFlag between", value1, value2, "tolisflag");
			return (Criteria) this;
		}

		public Criteria andTolisflagNotBetween(String value1, String value2) {
			addCriterion("ToLisFlag not between", value1, value2, "tolisflag");
			return (Criteria) this;
		}

		public Criteria andSerialnoIsNull() {
			addCriterion("SerialNo is null");
			return (Criteria) this;
		}

		public Criteria andSerialnoIsNotNull() {
			addCriterion("SerialNo is not null");
			return (Criteria) this;
		}

		public Criteria andSerialnoEqualTo(String value) {
			addCriterion("SerialNo =", value, "serialno");
			return (Criteria) this;
		}

		public Criteria andSerialnoNotEqualTo(String value) {
			addCriterion("SerialNo <>", value, "serialno");
			return (Criteria) this;
		}

		public Criteria andSerialnoGreaterThan(String value) {
			addCriterion("SerialNo >", value, "serialno");
			return (Criteria) this;
		}

		public Criteria andSerialnoGreaterThanOrEqualTo(String value) {
			addCriterion("SerialNo >=", value, "serialno");
			return (Criteria) this;
		}

		public Criteria andSerialnoLessThan(String value) {
			addCriterion("SerialNo <", value, "serialno");
			return (Criteria) this;
		}

		public Criteria andSerialnoLessThanOrEqualTo(String value) {
			addCriterion("SerialNo <=", value, "serialno");
			return (Criteria) this;
		}

		public Criteria andSerialnoLike(String value) {
			addCriterion("SerialNo like", value, "serialno");
			return (Criteria) this;
		}

		public Criteria andSerialnoNotLike(String value) {
			addCriterion("SerialNo not like", value, "serialno");
			return (Criteria) this;
		}

		public Criteria andSerialnoIn(List<String> values) {
			addCriterion("SerialNo in", values, "serialno");
			return (Criteria) this;
		}

		public Criteria andSerialnoNotIn(List<String> values) {
			addCriterion("SerialNo not in", values, "serialno");
			return (Criteria) this;
		}

		public Criteria andSerialnoBetween(String value1, String value2) {
			addCriterion("SerialNo between", value1, value2, "serialno");
			return (Criteria) this;
		}

		public Criteria andSerialnoNotBetween(String value1, String value2) {
			addCriterion("SerialNo not between", value1, value2, "serialno");
			return (Criteria) this;
		}

		public Criteria andMakedateIsNull() {
			addCriterion("MakeDate is null");
			return (Criteria) this;
		}

		public Criteria andMakedateIsNotNull() {
			addCriterion("MakeDate is not null");
			return (Criteria) this;
		}

		public Criteria andMakedateEqualTo(Date value) {
			addCriterionForJDBCDate("MakeDate =", value, "makedate");
			return (Criteria) this;
		}

		public Criteria andMakedateNotEqualTo(Date value) {
			addCriterionForJDBCDate("MakeDate <>", value, "makedate");
			return (Criteria) this;
		}

		public Criteria andMakedateGreaterThan(Date value) {
			addCriterionForJDBCDate("MakeDate >", value, "makedate");
			return (Criteria) this;
		}

		public Criteria andMakedateGreaterThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("MakeDate >=", value, "makedate");
			return (Criteria) this;
		}

		public Criteria andMakedateLessThan(Date value) {
			addCriterionForJDBCDate("MakeDate <", value, "makedate");
			return (Criteria) this;
		}

		public Criteria andMakedateLessThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("MakeDate <=", value, "makedate");
			return (Criteria) this;
		}

		public Criteria andMakedateIn(List<Date> values) {
			addCriterionForJDBCDate("MakeDate in", values, "makedate");
			return (Criteria) this;
		}

		public Criteria andMakedateNotIn(List<Date> values) {
			addCriterionForJDBCDate("MakeDate not in", values, "makedate");
			return (Criteria) this;
		}

		public Criteria andMakedateBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("MakeDate between", value1, value2, "makedate");
			return (Criteria) this;
		}

		public Criteria andMakedateNotBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("MakeDate not between", value1, value2, "makedate");
			return (Criteria) this;
		}

		public Criteria andMaketimeIsNull() {
			addCriterion("MakeTime is null");
			return (Criteria) this;
		}

		public Criteria andMaketimeIsNotNull() {
			addCriterion("MakeTime is not null");
			return (Criteria) this;
		}

		public Criteria andMaketimeEqualTo(String value) {
			addCriterion("MakeTime =", value, "maketime");
			return (Criteria) this;
		}

		public Criteria andMaketimeNotEqualTo(String value) {
			addCriterion("MakeTime <>", value, "maketime");
			return (Criteria) this;
		}

		public Criteria andMaketimeGreaterThan(String value) {
			addCriterion("MakeTime >", value, "maketime");
			return (Criteria) this;
		}

		public Criteria andMaketimeGreaterThanOrEqualTo(String value) {
			addCriterion("MakeTime >=", value, "maketime");
			return (Criteria) this;
		}

		public Criteria andMaketimeLessThan(String value) {
			addCriterion("MakeTime <", value, "maketime");
			return (Criteria) this;
		}

		public Criteria andMaketimeLessThanOrEqualTo(String value) {
			addCriterion("MakeTime <=", value, "maketime");
			return (Criteria) this;
		}

		public Criteria andMaketimeLike(String value) {
			addCriterion("MakeTime like", value, "maketime");
			return (Criteria) this;
		}

		public Criteria andMaketimeNotLike(String value) {
			addCriterion("MakeTime not like", value, "maketime");
			return (Criteria) this;
		}

		public Criteria andMaketimeIn(List<String> values) {
			addCriterion("MakeTime in", values, "maketime");
			return (Criteria) this;
		}

		public Criteria andMaketimeNotIn(List<String> values) {
			addCriterion("MakeTime not in", values, "maketime");
			return (Criteria) this;
		}

		public Criteria andMaketimeBetween(String value1, String value2) {
			addCriterion("MakeTime between", value1, value2, "maketime");
			return (Criteria) this;
		}

		public Criteria andMaketimeNotBetween(String value1, String value2) {
			addCriterion("MakeTime not between", value1, value2, "maketime");
			return (Criteria) this;
		}

		public Criteria andSaledepartIsNull() {
			addCriterion("SaleDepart is null");
			return (Criteria) this;
		}

		public Criteria andSaledepartIsNotNull() {
			addCriterion("SaleDepart is not null");
			return (Criteria) this;
		}

		public Criteria andSaledepartEqualTo(String value) {
			addCriterion("SaleDepart =", value, "saledepart");
			return (Criteria) this;
		}

		public Criteria andSaledepartNotEqualTo(String value) {
			addCriterion("SaleDepart <>", value, "saledepart");
			return (Criteria) this;
		}

		public Criteria andSaledepartGreaterThan(String value) {
			addCriterion("SaleDepart >", value, "saledepart");
			return (Criteria) this;
		}

		public Criteria andSaledepartGreaterThanOrEqualTo(String value) {
			addCriterion("SaleDepart >=", value, "saledepart");
			return (Criteria) this;
		}

		public Criteria andSaledepartLessThan(String value) {
			addCriterion("SaleDepart <", value, "saledepart");
			return (Criteria) this;
		}

		public Criteria andSaledepartLessThanOrEqualTo(String value) {
			addCriterion("SaleDepart <=", value, "saledepart");
			return (Criteria) this;
		}

		public Criteria andSaledepartLike(String value) {
			addCriterion("SaleDepart like", value, "saledepart");
			return (Criteria) this;
		}

		public Criteria andSaledepartNotLike(String value) {
			addCriterion("SaleDepart not like", value, "saledepart");
			return (Criteria) this;
		}

		public Criteria andSaledepartIn(List<String> values) {
			addCriterion("SaleDepart in", values, "saledepart");
			return (Criteria) this;
		}

		public Criteria andSaledepartNotIn(List<String> values) {
			addCriterion("SaleDepart not in", values, "saledepart");
			return (Criteria) this;
		}

		public Criteria andSaledepartBetween(String value1, String value2) {
			addCriterion("SaleDepart between", value1, value2, "saledepart");
			return (Criteria) this;
		}

		public Criteria andSaledepartNotBetween(String value1, String value2) {
			addCriterion("SaleDepart not between", value1, value2, "saledepart");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table es_doc_upinfo
	 * @mbg.generated  Mon Jan 14 14:35:27 CST 2019
	 */
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

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table es_doc_upinfo
     *
     * @mbggenerated do_not_delete_during_merge Sun Apr 15 11:27:02 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}