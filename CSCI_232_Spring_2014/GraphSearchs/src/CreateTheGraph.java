import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class CreateTheGraph 
{
	public Node rootNode;
	public ArrayList nodes=new ArrayList();
	public int[][] adjMatrix;//Edges will be represented as adjacency Matrix
	int size;
	public void setRootNode(Node n)
	{
		this.rootNode=n;
	}
	
	public Node getRootNode()
	{
		return this.rootNode;
	}
	
	public void addNode(Node n)
	{
		nodes.add(n);
	}
	
	//This method will be called to make connect two nodes
	public void connectNode(Node start,Node end)
	{
		if(adjMatrix==null)
		{
			size=nodes.size();
			adjMatrix=new int[size][size];
		}

		int startIndex=nodes.indexOf(start);
		int endIndex=nodes.indexOf(end);
		adjMatrix[startIndex][endIndex]=1;
		adjMatrix[endIndex][startIndex]=1;
	}
	
	private Node getUnvisitedChildNode(Node n)
	{
		
		int index=nodes.indexOf(n);
		int j=0;
		while(j<size)
		{
			if(adjMatrix[index][j]==1 && ((Node)nodes.get(j)).visited==false)
			{
				return (Node)nodes.get(j);
			}
			j++;
		}
		return null;
	}
	
	//BFS traversal of a tree is performed by the breadthFirstSearch() function
	public void breadthFirstSearch()
	{
		
		//BFS uses Queue data structure
		Queue queue=new LinkedList();
		queue.add(this.rootNode);
		printNode(this.rootNode);
		rootNode.visited=true;
		while(!queue.isEmpty())
		{
			Node n=(Node)queue.remove();
			Node child=null;
			while((child=getUnvisitedChildNode(n))!=null)
			{
				child.visited=true;
				printNode(child);
				queue.add(child);
			}
		}
		//Clear visited property of nodes
		clearNodes();
	}

	//DFS traversal of a tree is performed by the depthFirstSearch() function
	public void depthFirstSearch()
	{
		//DFS uses Stack data structure
		Stack stack=new Stack();
		stack.push(this.rootNode);
		rootNode.visited=true;
		printNode(rootNode);
		while(!stack.isEmpty())
		{
			Node n=(Node)stack.peek();
			Node child=getUnvisitedChildNode(n);
			if(child!=null)
			{
				child.visited=true;
				printNode(child);
				stack.push(child);
			}
			else
			{
				stack.pop();
			}
		}
		//Clear visited property of nodes
		clearNodes();
	}
	
	
	//Utility methods for clearing visited property of node
	private void clearNodes()
	{
		int i=0;
		while(i<size)
		{
			Node n=(Node)nodes.get(i);
			n.visited=false;
			i++;
		}
	}
	
	//Utility methods for printing the node stack label
	private void printNode(Node n)
	{
		System.out.print(n.label+" ");
	}
}
