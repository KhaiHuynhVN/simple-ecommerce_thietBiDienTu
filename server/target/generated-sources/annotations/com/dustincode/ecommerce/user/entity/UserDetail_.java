package com.dustincode.ecommerce.user.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(UserDetail.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class UserDetail_ extends com.dustincode.ecommerce.core.audit.AbstractAuditingEntity_ {

	
	/**
	 * @see com.dustincode.ecommerce.user.entity.UserDetail#address
	 **/
	public static volatile SingularAttribute<UserDetail, String> address;
	
	/**
	 * @see com.dustincode.ecommerce.user.entity.UserDetail#name
	 **/
	public static volatile SingularAttribute<UserDetail, String> name;
	
	/**
	 * @see com.dustincode.ecommerce.user.entity.UserDetail#id
	 **/
	public static volatile SingularAttribute<UserDetail, Long> id;
	
	/**
	 * @see com.dustincode.ecommerce.user.entity.UserDetail
	 **/
	public static volatile EntityType<UserDetail> class_;
	
	/**
	 * @see com.dustincode.ecommerce.user.entity.UserDetail#user
	 **/
	public static volatile SingularAttribute<UserDetail, User> user;

	public static final String ADDRESS = "address";
	public static final String NAME = "name";
	public static final String ID = "id";
	public static final String USER = "user";

}

