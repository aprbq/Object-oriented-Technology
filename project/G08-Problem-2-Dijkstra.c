#include <unistd.h>
#include <stdio.h>  // เรียกใช้ไลบรารีสำหรับการใช้ฟังก์ชัน printf และ scanf
#include <stdlib.h> // เรียกใช้ไลบรารีสำหรับการใช้ฟังก์ชันที่เกี่ยวข้องกับการจัดการเมมโมรี

#define INFINITY 99 // กำหนดค่าคงที่ 

void dijkstra(int **, int, int); // ประกาศฟังก์ชัน Prototype

// ฟังก์ชัน main()
int main() {
    int i, j, vertices, source; // สร้างตัวแปรเพื่อเก็บค่าต่าง ๆ ของกราฟ
    while(1) {  // ใช้ while loop เพื่อให้เป็น infinity loop สำหรับรับจำนวนโนดในกราฟ
        printf("Enter the number of vertices: "); 
        scanf("%d", &vertices); // เก็บจำนวนโนดเก็บไว้ที่ตัวแปร vertices
        if (vertices <= 0) {
            printf("Invalid number of vertices. Please try again.\n\n");
        } else {
            break;
        }
    }
    int **graph = malloc(vertices * sizeof(int)); // จองพื้นที่หน่วยความจำสำหรับเก็บข้อมูล array แบบสองมิติ
    for (i = 0; i < vertices; i++) {
        graph[i] = malloc(vertices * sizeof(int)); // จองเพื่อจองพื้นที่หน่วยความจำสำหรับแต่ละแถว
    }

    printf("\nEnter the adjacency matrix:\n"); //for loop ซ้อน loop ใช้รับค่า adjacency ของกราฟ
    for (i = 0; i < vertices; i++) {
        for (j = 0; j < vertices; j++) {
            scanf("%d", &graph[i][j]);
            if (graph[i][j] == 0) {
                graph[i][j] = INFINITY;
            }
        }
    }
    printf("\n");
    while(1) {  // ใช้ while loop เพื่อให้เป็น infinity loop สำหรับรับค่าโนดเริ่มต้น
        printf("Enter the starting node: ");
        scanf("%d", &source); // เก็บค่าโนดเริ่มต้นไว้ที่ตัวแปร source

        if (source < 0 || source >= vertices) {
            printf("Invalid starting node. Plese try again.\n"); // ถ้าป้อนค่าที่น้อยกว่า 0 หรือ มากกว่าจำนวนโนดให้วนรับค่าใหม่
        }
        else {
            break; // ไม่เช่นนั้น จะหยุดการทำงานของ while loop
        }
    }
    

    dijkstra(graph, vertices, source); // call ฟังก์ชัน dijkstra และส่งค่าที่รับเข้ามาไปทำงานต่อ
    
    // หลังจากใช้เสร็จแล้วให้คืนเมมโมรี
    for (i = 0; i < vertices; i++) {
        free(graph[i]);
    }
    free(graph);
    
    return 0; // โปรแกรมรันผ่านจะคืนค่า 0
}

void dijkstra(int **cost, int vertices, int sourcenode) // ฟังก์ชันเพื่อใช้คำนวณหาระยะทางที่สั้นที่สุด
{
    int distance[vertices], path[vertices]; // สร้างตัวแปร Array เพื่อเก็บระยะทางและเส้นทาง
    int visited[vertices], count, minDistance, nextNode, i, j; // สร้างตัวแปร Array เพื่อเช็คว่าผ่านโนดนั้นแล้ว และใช้นับ, เก็บระยะทางที่สั้น และโนดต่อไป

    // กำหนดค่าเริ่มต้นสำหรับระยะทาง, เส้นทาง, และสถานะของโนดทั้งหมด
    for(i = 0; i < vertices; i++) {
        distance[i] = cost[sourcenode][i];
        path[i] = sourcenode;
        visited[i] = 0;
    }

    distance[sourcenode] = 0; // กำหนดระยะทางเริ่มต้นจากโนดต้นทาง (sourcenode) เป็น 0
    visited[sourcenode] = 1; // ทำเครื่องหมายว่าเราผ่านโนดนี้แล้ว
    count = 1; // นับจำนวนโนดที่ผ่านไปแล้ว

    // ลูปเพื่อหาทางที่สั้นที่สุดโดยนับจำนวนโนดที่ผ่านไป (count) ถ้าไม่เท่ากับ (vertices-1) คือโนดทั้งหมดลบโนดต้นทาง
    while (count < vertices-1) {
        minDistance = INFINITY;

        // หาโนดถัดไปที่มีระยะทางสั้นที่สุด
        for (i = 0; i < vertices; i++) {
            if((distance[i] < minDistance) && (!visited[i]))
            {
                minDistance = distance[i];
                nextNode = i;
            }
        }
        
        // ทำเครื่องหมายว่าผ่านโนดนี้แล้ว
        visited[nextNode] = 1;

        // ปรับระยะทางของโนดที่ยังไม่ผ่าน
        for(i = 0; i < vertices; i++) 
        {
            if(!visited[i])
            {
               if(minDistance + cost[nextNode][i] < distance[i])
                {
                    distance[i] = minDistance + cost[nextNode][i];
                    path[i] = nextNode;
                } 
            }
        }
        count++;
    }

    printf("\n");
    for (int i = 0; i < vertices; i++) 
    {
        if (i != sourcenode) 
        {
            // แสดงระยะทางจากโนดต้นทางไปยังโนดปลายทาง
            printf("Distance from v%d to v%d = %d\n", sourcenode,  i, distance[i]);
            // แสดงเส้นทางจากโนดต้นทางไปยังโนดปลายทาง
            printf("Path: v%d -> ", sourcenode);

            int j = i;
            // สร้างอาร์เรย์เพื่อเก็บเส้นทางจากโนดปลายทางไปยังโนดต้นทาง
            int pathArray[vertices], pathLength = 0;
            do {
                pathArray[pathLength++] = j;
                j = path[j];
            } while (j != sourcenode);
            // วนลูปเพื่อแสดงเส้นที่สั้นที่สุดจาก sourcenode ไปยัง node อื่น ๆ
            for (int k = pathLength - 1; k >= 0; k--) 
            {
                printf("v%d", pathArray[k]); 
                if (k > 0) {
                    printf(" -> ");
                }
            }
            printf("\n\n");
        }
    }
    sleep(500);
}

