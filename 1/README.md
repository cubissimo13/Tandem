# Tandem 
Сортирует переданный список записей (каждая запись - набор колонок) таблицы по указанной колонке по следующим правилам:

     *  в колонке могут быть null и пустые значения - строки с null-значениями должны быть первыми, затем строки с пустым значением, затем все остальные,
     *  строка бьется на подстроки следующим образом: выделяем непрерывные максимальные фрагменты строки, состоящие только из цифр, и считаем набором подстрок эти фрагменты и все оставшиеся от такого разбиения фрагменты строки
     *  при сравнении строк осуществляется последовательное сравнение их подстрок до первого несовпадения,
     *  если обе подстроки состоят из цифр - то при сравнении они интерпретируются как целые числа (вначале должно идти меньшее число), в противном случае - как строки,
     *  сортировка должна быть устойчива к исходной сортировке списка - т.е., если строки (в контексте указанных правил сравнения) неразличимы, то сортировка не должна менять их местами.
