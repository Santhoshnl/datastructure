package com.paremal.sheebu.data_structure.queue;

public class ArrayQueue<E> implements Queue<E> {
	
	private E[] data;
	private int f=0;
	private int sz=0;
	
	
	

	public ArrayQueue() {
		this(10);
	}
	

	public ArrayQueue(int capacity) {
		super();
		data= (E[]) new Object[capacity];
	}


	@Override
	public int size() {
		// TODO Auto-generated method stub
		return sz;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (sz==0);
	}

	@Override
	public void enqueue(E e)throws IllegalStateException {
		// TODO Auto-generated method stub
		if(sz==data.length){
			throw new IllegalStateException("queue is full");
		}
		int avail=(f+sz)%data.length;
		data[avail]=e;
		sz++;

	}

	@Override
	public E first() {
		// TODO Auto-generated method stub
		if(isEmpty()){
			return null;
		}
		return data[f];
	}

	@Override
	public E dequeue() {
		// TODO Auto-generated method stub
		if(isEmpty()){
			return null;
		}
		E e=data[f];
		data[f]=null;
		f=(f+1)%data.length;
		sz--;
		return e;
	}

}
