package com.example.admob;
class result{
    private int [][]arr;
    private int countX;
    private int countO;
    result()
    {
        countO=0;
        countX=0;
        arr= new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr[i][j]=2;
            }
        }

    }
    void de()
    {
        countO=0;
        countX=0;
        arr= new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr[i][j]=2;
            }
        }
    }
    boolean sete(int a, String chan)
    {
        int i=a/3;
        int j=a%3;
        if(chan.equals("X")) {
            arr[i][j] = 1;
            countX=countX+1;
            return countX >= 3 && check(chan) == 1;
        }
        else {
            arr[i][j] = 0;
            countO=countO+1;
            return countO >= 3 && check(chan) == 1;
        }
    }
    private int check(String chan)
    {
        if(chan.equals("X")) {
            int countw=0;
            int county=0;
            int k=2;
            for (int i = 0; i < 3; i++) {
                int count = 0;
                for (int j = 0; j < 3; j++) {
                    if (arr[i][j] == 1)
                    {
                        count=count+1;
                    }
                }
                if(count==3)
                {
                    return 1;
                }
                count=0;
                for (int j = 0; j < 3; j++) {
                    if (arr[j][i] == 1)
                    {
                        count=count+1;
                    }
                }
                if(count==3)
                {
                    return 1;
                }
                if(arr[i][i]==1)
                    countw=countw+1;
                if(arr[i][k]==1)
                    county=county+1;
                k--;
            }
            if(countw==3||county==3)
            {
                return 1;
            }
        }
        else {
            int countw = 0;
            int county = 0;
            int k=2;
            for (int i = 0; i < 3; i++) {
                int count = 0;
                for (int j = 0; j < 3; j++) {
                    if (arr[i][j] == 0) {
                        count = count + 1;
                    }
                }
                if (count == 3) {
                    return 1;
                }
                count = 0;
                for (int j = 0; j < 3; j++) {
                    if (arr[j][i] == 0) {
                        count = count + 1;
                    }
                }
                if (count == 3) {
                    return 1;
                }
                if (arr[i][i] == 0)
                    countw = countw + 1;
                if (arr[i][k] == 0)
                    county = county + 1;
                k--;
            }
            if (countw == 3 || county == 3) {
                return 1;
            }
        }
        return 0;
    }
}
