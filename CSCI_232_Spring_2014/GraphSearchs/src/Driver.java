public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		//Lets create nodes as given as an example in the article
		Node nA=new Node('A');
		Node nB=new Node('B');
		Node nC=new Node('C');
		Node nD=new Node('D');
		Node nE=new Node('E');
		Node nF=new Node('F');

		//Create the graph, add nodes, create edges between nodes
		CreateTheGraph graph=new CreateTheGraph();
		graph.addNode(nA);
		graph.addNode(nB);
		graph.addNode(nC);
		graph.addNode(nD);
		graph.addNode(nE);
		graph.addNode(nF);
		graph.setRootNode(nA);
		
		graph.connectNode(nA,nB);
		graph.connectNode(nA,nC);
		graph.connectNode(nA,nD);
		
		graph.connectNode(nB,nE);
		graph.connectNode(nB,nF);
		graph.connectNode(nC,nF);
		
		
		//Perform the traversal of the graph
		System.out.println("DFS Traversal of a tree is ------------->");
		graph.depthFirstSearch();
                System.out.println();
		
		System.out.println("\nBFS Traversal of a tree is ------------->");
		graph.breadthFirstSearch();
                System.out.println();
		
		
		
		
	}

}
