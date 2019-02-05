package no.hvl.dat110.system.controller;

import no.hvl.dat110.rpc.*;

public class Sensor extends RPCStub {

	private byte RPCID = 1;
	
	public int read() {
		
		int temp;
		
		// TODO
		// implement marshalling, call and unmarshalling for read RPC method
	
		byte[] byteSend = RPCUtils.marshallVoid(RPCID);
		
		byte[] byteMotta = rmiclient.call(byteSend);
		
		return RPCUtils.unmarshallInteger(byteMotta);
	
	}
	
}
