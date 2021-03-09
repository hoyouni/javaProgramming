package collectionFramework;

// TreeSet
/*
 * 이진검색트리라는 자료구조의 형태로 데이터 저장
 * 이진검색트리 : 정렬, 검색, 범위 검색에 높은 성능을 보이는 자료구조
 * TreeSet은 이진검색트리의 성능을 향상시킨 '레드-블랙 트리'로 구현
 * Set인터페이스를 구현했기 때문에 중복된 데이터의 저장을 허용하지 않으며 정렬된 위치에 저장하므로 저장 순서를 유지하지 않음
 * leftNode, rightNode, element 로 구성 
 * 데이터 추가/삭제 의 경우 LinkedList 보다 더 오래걸리지만
 * 배열이나 LinkedList 보다 검색과 정렬기능이 뛰어남
 * 모든 노드는 최대 두 개의 자식노드를 가질 수 있다
 * 왼쪽 자식 노드 값은 부모 노드의 값 보다 작고 오른쪽 자식 노드의 값은 부모노드의 값 보다 커야한다.
 * 노드의 추가 삭제에 시간이 걸린다.
 * 검색과 정렬에 유리하다.
 * 중복된 값을 저장하지 못한다.
 */
public class TreeSetEx {
	public static void main(String[] args) {
		
	}
}
