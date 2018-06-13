package cn.origin.mydubbo.provider.service.impl;

import cn.origin.mydubbo.vo.Message;
import org.springframework.stereotype.Service;

import cn.origin.mydubbo.service.*;
@Service
public class MessageServiceImpl implements IMessageService {

	@Override
	public Message echo(Message msg) {
		Message echoMsg = new Message() ;
		echoMsg.setTitle("【ECHO】" + msg.getTitle());
		echoMsg.setContent("【ECHO】" + msg.getContent());
		echoMsg.setSender("MessageProvider");
		return echoMsg ;
	}

}
