package com.bfsi.mfi.cbs.adapter.rmi;

import org.springframework.beans.BeanUtils;

import com.bfsi.mfi.cbs.adapter.CbsTransactionServiceAdapter;

import com.bfsi.mfi.cbs.request.CbsDepositNewAccountRequest;
import com.bfsi.mfi.cbs.response.CbsBaseResponse;
import com.bfsi.mfi.exception.ServiceException;
import com.bfsi.mfi.util.LoggerUtil;
import com.cbs.bean.CbsBaseTransResponse;
import com.cbs.bean.CbsDepositNewAccountTranRequest;
import com.cbs.rmi.impl.CbsTranInterfaceImpl;
import com.cbs.service.CbsTranInterface;

/**
 * 
 * @author Shabu
 *
 */
public class CbsDepositNewAccReqServiceRmiAdapter implements
CbsTransactionServiceAdapter<CbsDepositNewAccountRequest, CbsBaseResponse> {

	@Override
	public CbsBaseResponse performTransaction(
			CbsDepositNewAccountRequest p_tranRequest) throws ServiceException {
		CbsBaseResponse l_res = new CbsBaseResponse();
		/*CbsDepositNewAccountTranRequest l_depNewAccReq = new CbsDepositNewAccountTranRequest();
		l_res.setCbsResStat("P");
		l_res.setCbsResTxnRefNo("112323");
		l_res.setResponseCode("0");
		l_res.setResponseMessage("NEW DEPOSIT ACCOUNT REQUEST SUCCCESS");
		l_res.setStatus(true);
		try{
			if(p_tranRequest != null){
				BeanUtils.copyProperties(p_tranRequest, l_depNewAccReq);
			}
			
			CbsTranInterface tranIntr = new CbsTranInterfaceImpl();
			CbsBaseTransResponse l_cbsRes = tranIntr.postDepositNewAccReq(l_depNewAccReq);
			
			if(l_cbsRes.getResponseCode().equals("0"))
				l_res.setStatus(true);
			else 
				l_res.setStatus(false);
			BeanUtils.copyProperties(l_cbsRes,l_res);
			
			LoggerUtil.cbsJobDebug("Rmi Response ::"+l_res.toString());
		
		} catch(Exception e){
			e.printStackTrace();
		}*/
		return l_res;
	}

}
