package com.dustincode.ecommerce.user.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.Instant;

@StaticMetamodel(UserSession.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class UserSession_ extends com.dustincode.ecommerce.core.audit.AbstractAuditingEntity_ {

	
	/**
	 * @see com.dustincode.ecommerce.user.entity.UserSession#accessTokenId
	 **/
	public static volatile SingularAttribute<UserSession, String> accessTokenId;
	
	/**
	 * @see com.dustincode.ecommerce.user.entity.UserSession#expireTime
	 **/
	public static volatile SingularAttribute<UserSession, Instant> expireTime;
	
	/**
	 * @see com.dustincode.ecommerce.user.entity.UserSession#refreshTokenId
	 **/
	public static volatile SingularAttribute<UserSession, String> refreshTokenId;
	
	/**
	 * @see com.dustincode.ecommerce.user.entity.UserSession#id
	 **/
	public static volatile SingularAttribute<UserSession, Long> id;
	
	/**
	 * @see com.dustincode.ecommerce.user.entity.UserSession
	 **/
	public static volatile EntityType<UserSession> class_;
	
	/**
	 * @see com.dustincode.ecommerce.user.entity.UserSession#user
	 **/
	public static volatile SingularAttribute<UserSession, User> user;

	public static final String ACCESS_TOKEN_ID = "accessTokenId";
	public static final String EXPIRE_TIME = "expireTime";
	public static final String REFRESH_TOKEN_ID = "refreshTokenId";
	public static final String ID = "id";
	public static final String USER = "user";

}

