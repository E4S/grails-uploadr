<%
def msie = request.getHeader('user-agent').contains("MSIE")
%>
<div class="warning">
	<div class="message">
		To use this application you need a <a href="http://en.wikipedia.org/wiki/HTML5" target="_html5">HTML5</a> capable browser:
	</div>
	<div class="browsers">
		<div class="browser chrome">
			<div class="anchor">
				<a href="http://www.google.com/chrome" target="_chrome">Get Chrome</a>
			</div>
		</div>
		<div class="browser firefox">
			<div class="anchor">
				<a href="http://www.mozilla.com/firefox" target="_firefox">Get Firefox</a>
			</div>
		</div>
		<div class="browser safari">
			<div class="anchor">
				<a href="http://www.apple.com/safari/" target="_safari">Get Safari</a>
			</div>
		</div>
	</div>
<g:if test="${msie}">
	<div class="message">
		upgrade to <a href="http://ie.microsoft.com/testdrive/" target="_ie10">Internet Explorer 10</a> or install the<br/>
		<a href="http://www.google.com/chromeframe" target="_chromeframe">Google Chrome Frame</a> browser plugin for Internet Explorer:
	</div>
	<div class="button">
		<a href="http://www.google.com/chromeframe" target="_chromeframe">Install Google Chrome Frame Plugin</a>
	</div>
</g:if>
</div>