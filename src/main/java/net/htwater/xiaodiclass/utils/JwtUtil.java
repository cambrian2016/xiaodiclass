package net.htwater.xiaodiclass.utils;

import io.jsonwebtoken.*;
import net.htwater.xiaodiclass.domain.User;

import java.util.Date;

/**
* 类  名：JwtUtil
* 描  述：Jwt 工具类
* <p>
* 功能一：1.生成的token,是可以通过base64进行解密出明文信息
*       2.base64进行解密出的明文信息,修改后再进行编码.则会解密失败,
*       3.无法作废已颁布的token，除非改秘钥
*
* @author ShenHaiyun no.HT151 软件部移动组
* @date
*/
public class JwtUtil {

    //过期时间
    private static final long EXPIRE=1000*60*60*24*7L;

    //加密密钥
    private static final String SECRET="xdclass.net168";

    //令牌前缀
    private static final String TOKEN_PREFIX="xdclass";

    //主题
    private static final String SUBJECT="xdclass";

    //根据用户信息,生成令牌
    public static String geneJsonWebToken(User user){
        String token= Jwts.builder()
                .setSubject(SUBJECT)
                .claim("head_img",user.getHeadImg())
                .claim("id",user.getId())
                .claim("name",user.getName())
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis()+EXPIRE))
                .signWith(SignatureAlgorithm.HS256,SECRET).compact();

        token=TOKEN_PREFIX+token;
        return token;
    }

    //校验token
    public static Claims checkJwt(String token){

        Claims claims= null;
        try {
            claims = Jwts.parser()
                    .setSigningKey(SECRET)
                    .parseClaimsJws(token.replace(TOKEN_PREFIX,""))
                    .getBody();
        } catch (ExpiredJwtException e) {
            e.printStackTrace();
        } catch (UnsupportedJwtException e) {
            e.printStackTrace();
        } catch (MalformedJwtException e) {
            e.printStackTrace();
        } catch (SignatureException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        return claims;
    }
}
