package com.dustincode.ecommerce.user.entity;

import com.dustincode.ecommerce.user.entity.enumerations.MFAType;
import com.dustincode.ecommerce.user.entity.enumerations.Role;
import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(User.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class User_ extends com.dustincode.ecommerce.core.audit.AbstractAuditingEntity_ {

	
	/**
	 * @see com.dustincode.ecommerce.user.entity.User#password
	 **/
	public static volatile SingularAttribute<User, String> password;
	
	/**
	 * @see com.dustincode.ecommerce.user.entity.User#userSessions
	 **/
	public static volatile ListAttribute<User, UserSession> userSessions;
	
	/**
	 * @see com.dustincode.ecommerce.user.entity.User#role
	 **/
	public static volatile SingularAttribute<User, Role> role;
	
	/**
	 * @see com.dustincode.ecommerce.user.entity.User#userTokens
	 **/
	public static volatile ListAttribute<User, UserToken> userTokens;
	
	/**
	 * @see com.dustincode.ecommerce.user.entity.User#phone
	 **/
	public static volatile SingularAttribute<User, String> phone;
	
	/**
	 * @see com.dustincode.ecommerce.user.entity.User#mfaType
	 **/
	public static volatile SingularAttribute<User, MFAType> mfaType;
	
	/**
	 * @see com.dustincode.ecommerce.user.entity.User#userDetail
	 **/
	public static volatile SingularAttribute<User, UserDetail> userDetail;
	
	/**
	 * @see com.dustincode.ecommerce.user.entity.User#id
	 **/
	public static volatile SingularAttribute<User, Long> id;
	
	/**
	 * @see com.dustincode.ecommerce.user.entity.User
	 **/
	public static volatile EntityType<User> class_;
	
	/**
	 * @see com.dustincode.ecommerce.user.entity.User#email
	 **/
	public static volatile SingularAttribute<User, String> email;
	
	/**
	 * @see com.dustincode.ecommerce.user.entity.User#mfaSecret
	 **/
	public static volatile SingularAttribute<User, String> mfaSecret;

	public static final String PASSWORD = "password";
	public static final String USER_SESSIONS = "userSessions";
	public static final String ROLE = "role";
	public static final String USER_TOKENS = "userTokens";
	public static final String PHONE = "phone";
	public static final String MFA_TYPE = "mfaType";
	public static final String USER_DETAIL = "userDetail";
	public static final String ID = "id";
	public static final String EMAIL = "email";
	public static final String MFA_SECRET = "mfaSecret";

}

