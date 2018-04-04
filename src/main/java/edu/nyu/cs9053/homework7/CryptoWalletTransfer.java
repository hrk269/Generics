package edu.nyu.cs9053.homework7;

public class CryptoWalletTransfer<T extends CryptoWallet> {
	
    public void walletTransfer(Wallet<? extends T> producerCryptoWallet, Wallet<? super T> consumerCryptoWallet){
        for (int i = 0; i < producerCryptoWallet.size(); i++) {
            consumerCryptoWallet.add(producerCryptoWallet.get(i));
        }
    }
}
