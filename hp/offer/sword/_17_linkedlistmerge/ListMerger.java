package hp.offer.sword._17_linkedlistmerge;


public class ListMerger {
  public ListNode merge(ListNode listA, ListNode listB) {
    
    if(null == listA) {
      return listB;
    } else if(null == listB) {
      return listA;
    }
    ListNode node = null;
    if(listA.value < listB.value) {
      node = listA;
      merge(listA.next, listB);
    } else {
      node = listB;
      merge(listA, listB.next);
    }
    return node;
  }
}
