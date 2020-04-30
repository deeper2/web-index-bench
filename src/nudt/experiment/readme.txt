首先,采用terrier进行索引构建
（
  trec_setup.bat "wt2g path";
  替换etc/collection.spec文件;
  trec_terrier.bat;
  ）
之后,TradiIndexConverter.java
然后,FastMaxScoreExtractor.java
最后,DocDictConverter.java


lib中必要的jar包：
trove\terrier\log4j\