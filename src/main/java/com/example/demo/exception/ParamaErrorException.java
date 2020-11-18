package com.example.demo.exception;
/** 
 * @author 作者 zuoruibo: 
 * @date 创建时间：2020年11月18日 上午10:14:40 
 * @version 1.0 
 * @parameter 
 * @since 
 * @return 
 */
public class ParamaErrorException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public ParamaErrorException() {
	}

	public ParamaErrorException(String message) {
		super(message);
	}
}
