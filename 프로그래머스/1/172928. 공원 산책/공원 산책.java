
class Solution {
   public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        
        char [][] grid= new char[park.length][];
        
        for (int i = 0; i < park.length; i++) {
			grid[i] = park[i].toCharArray();
		}
        
      out:for (int i = 0; i < grid.length; i++) { //시작 지점 찾기.
		for (int j = 0; j < grid[i].length; j++) {
			if(grid[i][j] == 'S') {
				answer[0]= i;
				System.out.println("i : "+i);
				answer[1]= j;
				System.out.println("j : "+j);
				break out;
			}
		}
      }
      
      
      
      for (String commend : routes) {
    	  //명령어 셋팅
    	  String direction = commend.split(" ")[0];
    	  int foward = Integer.parseInt(commend.split(" ")[1]);
    	  int [] backUp = answer.clone(); //좌표 백업
    	  
    	  try {    		  
    		  switch(direction) {
    		  case "N":
    			  for (int x = answer[0], j = 0; j <= foward; x--,j++) {
					if(grid[x][answer[1]] == 'X') {
						throw new Exception();
					}
					answer[0] = x;
    			  }
    			  break;
    		  case "S":
    			  for (int x = answer[0], j = 0; j <= foward; x++,j++) {
  					if(grid[x][answer[1]] == 'X') {
  						throw new Exception();
  					}
  					answer[0] = x;
      			  }
    			  break;
    		  case "W":
    			  for (int y = answer[1], j = 0; j <= foward; y--,j++) {
    					if(grid[answer[0]][y] == 'X') {
    						throw new Exception();
    					}
    					answer[1] = y;
        			  }
    			  break;
    		  case "E":
    			  for (int y = answer[1], j = 0; j <= foward; y++,j++) {
  					if(grid[answer[0]][y] == 'X') {
  						throw new Exception();
  					}
  					answer[1] = y;
      			  }
    			  break;
    		  }
    	  }catch(Exception e){
    		  answer = backUp.clone();
    	  }
    	  
	}
 
        return answer;
    }
}