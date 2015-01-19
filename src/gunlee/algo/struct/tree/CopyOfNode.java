package gunlee.algo.struct.tree;

public class CopyOfNode<T extends Comparable<? super T>> {
	T data;
	CopyOfNode<T> left;
	CopyOfNode<T> right;
	public CopyOfNode(T data) {
		this.data = data;
	}
	
	public void setLeft(CopyOfNode<T> node) {
		this.left = node;
	}
	
	public void setRight(CopyOfNode<T> node) {
		this.right = node;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public CopyOfNode<T> getLeft() {
		return left;
	}

	public CopyOfNode<T> getRight() {
		return right;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", left=" + left + ", right=" + right
				+ "]";
	}
	
}
