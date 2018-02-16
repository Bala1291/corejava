package com.pra;
 class  Th1 extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println("value of i=" +i);
				Thread.sleep(1000);
			}
				
			}
			catch(InterruptedException ie)
			{
				System.out.println(ie);

			}
		}
	}


 class ThDemo1 {
	public static void main(String[] args) {
		Th1 t1=new Th1();
		System.out.println();
		t1.start();

	}

	};

