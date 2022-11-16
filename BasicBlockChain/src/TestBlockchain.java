
public class TestBlockchain {

	public static void main(String args[]) {
		
		Blockchain tcpCoin = new Blockchain();

		Block comp = new Block("0x200", new java.util.Date(), "<transcations>");
		Block sci = new Block("0x200", new java.util.Date(), "<transcations>");
		Block wizard = new Block("0x200", new java.util.Date(), "<transcations>");
		
		tcpCoin.addBlock(comp);
		tcpCoin.addBlock(sci);
		tcpCoin.addBlock(wizard);
		
	//	tcpCoin.getLastestBlock().setPreviousHash("ABCDEFG");
		
		tcpCoin.displayChain();
		tcpCoin.isValid();
	}
	
}