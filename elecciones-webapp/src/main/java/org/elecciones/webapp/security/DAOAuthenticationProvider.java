package org.elecciones.webapp.security;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.elecciones.core.security.User;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;

/**
 * 
 * @author ocalsin
 *
 */

public class DAOAuthenticationProvider implements AuthenticationProvider{

	
	
	protected final Log logger = LogFactory.getLog(getClass());

//	@Autowired
//	private UserService userService;
	
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {

		UsernamePasswordAuthenticationToken successToken = null;

		if(SessionDetail.getUserDetails() == null){
			System.out.println(":: DAO authenticate ::");
			String username = null;
			String password = null;
			
			try {
				username = authentication.getPrincipal().toString();
				password = authentication.getCredentials().toString();
			} catch (Exception e) {
				logger.info(e.getMessage(), e);
				throw new BadCredentialsException("Username or Password is empty: " + username);
			}
			
			if(StringUtils.isEmpty(username) || StringUtils.isEmpty(password)) {
				throw new BadCredentialsException("Username or Password is empty: " + username);
			}
			System.out.println("username: "+username);
			
//			User user = userService.getUserDAOAuthenticate(username, password);
			User user = null;
			if(username.equals("admin") && password.equals("admin")){
				user = new User();
			}
			
			
			System.out.println("user: "+user);
			if(user == null) {
				throw new BadCredentialsException("DAO: User's Information need to be updated, user " + username);
			}
			
			GrantedAuthority[] authorities = null;
			if (user.getRoles() != null && user.getRoles().length > 0) {
				int index = 0;
				authorities = new GrantedAuthorityImpl[user.getRoles().length];
				for (String role : user.getRoles()) {
					authorities[index] = new GrantedAuthorityImpl(role);
					index ++;
				}
			}
			System.out.println("authorities: "+authorities);
			successToken = new UsernamePasswordAuthenticationToken(authentication.getPrincipal().toString(), authorities);
			successToken.setDetails(user);
			System.out.println("USER authenticated>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>:"+username+":<<<<<<<<<<<<<<<<<<<<<<<<");
		}else {
			successToken = (UsernamePasswordAuthenticationToken)SessionDetail.getAuthentication();
		}
		return successToken;
	}

	public boolean supports(Class<? extends Object> authentication) {
		return true;
	}
}
