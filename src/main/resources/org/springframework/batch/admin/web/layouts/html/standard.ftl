<#import "/spring.ftl" as spring />
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title><@spring.messageText code=titleCode!"title" text=titleText!"Spring Batch Admin"/></title>
<#assign url><@spring.url relativeUrl="${servletPath}/batch/resources/styles/main.css"/></#assign>
<link rel="stylesheet" href="${url?replace("/batch/batch/", "/batch/")}" type="text/css"></link>
<#assign url><@spring.url relativeUrl="${servletPath}/batch/resources/styles/colors.css"/></#assign>
<link rel="stylesheet" href="${url?replace("/batch/batch/", "/batch/")}" type="text/css"></link>
<#assign url><@spring.url relativeUrl="${servletPath}/batch/resources/styles/local.css"/></#assign>
<link rel="stylesheet" href="${url?replace("/batch/batch/", "/batch/")}" type="text/css"></link>
<#assign url><@spring.url relativeUrl="${servletPath}/batch/resources/styles/print.css"/></#assign>
<link rel="stylesheet" href="${url?replace("/batch/batch/", "/batch/")}" type="text/css" media="print"></link>
<#if feedPath??>
<#assign url><@spring.url relativeUrl="${servletPath}/batch${feedPath}"/></#assign>
	<link rel="alternate" type="application/rss+xml" title="RSS Feed" href="${url}">
</#if>
<#assign url><@spring.url relativeUrl="${servletPath}/batch/resources/js/jquery-1.4.2.min.js"/></#assign>
<script src="${url?replace("/batch/batch/", "/batch/")}" type="text/javascript"></script>
<#assign url><@spring.url relativeUrl="${servletPath}/batch/resources/js/jquery.validate-1.7.0.min.js"/></#assign>
<script src="${url?replace("/batch/batch/", "/batch/")}" type="text/javascript"></script>
<!-- 
Some icons from Silk icon set 1.3 by Mark James, http://www.famfamfam.com/lab/icons/silk/
 -->
</head>
<body class="main">
<div id="page"><#include "header.ftl"> <#include "navigation.ftl">
<div id="container">
<#if side??>
<div id="secondary-navigation">
	<#include side>
</div>
</#if>
<#assign class><#if side??><#else>class="no-side-nav"</#if></#assign>
<div id="content" ${class}>
<div id="body"><#include body></div>
</div>
<!-- /content --></div>
<!-- /container --> <#include "footer.ftl"></div>
<!-- /page -->
</body>
</html>
