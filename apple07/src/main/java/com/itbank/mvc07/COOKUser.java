package com.itbank.mvc07;

public class COOKUser {

	public static void main(String[] args) {
		
		COOKType non = new NonChainCOOK();
		non.cooking();
		non.prepare();
		non.sellFood();
		non.supplyElements();
		
		COOKType chain = new ChainCOOK();
		chain.cooking();
		chain.prepare();
		chain.sellFood();
		chain.supplyElements();
		
	}
}
