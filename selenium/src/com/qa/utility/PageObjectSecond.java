* @return the web element
     */
    @Deprecated
    public static WebElement waitExplicit(final By by) {
        WebDriverWait wait = DriverManager.getWebDriverWait(Driver.TIMEOUT_20_SEC);
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
        // This is the same implementation as EC.presenceOfElementLocated(By)
        /*
         * WebElement we = wait.until(new ExpectedCondition<WebElement>() {
         *
         * @Override public WebElement apply(WebDriver driver) { return driver.findElement(by); } }); return we;
         */
    }

    /**
     * Waits for the given number of windows.
     *
     * @param numberOfWindows number of windows to wait for
     */
    public static void waitForNumberOfWindowsToEqual(final int numberOfWindows) {
        WebDriverWait wait = DriverManager.getWebDriverWait(Driver.TIMEOUT_20_SEC);

        wait.until(new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver driver) {
                return driver.getWindowHandles().size() == numberOfWindows;
            }

            @Override
            public String toString() {
                return String.format("(%d) windows to appear - ", numberOfWindows) + takeScreenshot();
            }
        });
    }

    /**
     * *************************.
     *
     * @param element
     *            the element
     * @return the web element
     */
    /* Click methods */
    /**************************/

    /**
     * Waits for an element to fully hit the page (loaded into DOM and visible to the naked eye) before clicking the
     * element. This is to be used in place of assuming that WebDriver's implicit wait will adequately wait for your
     * element to appear. Please use this method for all your clicking needs.
     *
     * @param element thing you want to click
     * @return WebElement of the element that was clicked. Note that in most cases this element will be stale, which
     * could be a useful thing to wait for.
     */
    public static WebElement loadAndClick(By element) {
        return loadAndClick(waitForEnabled(element));
    }

    /**
     * Clicks a specified area on the page. Remember the top left corner will be 0,0 so X will usually be positive, and
     * Y will likely be negative.
     *
     * @param elementBy - as a By, the element to click within at location x,y I.E. the whole page, or a dialog as a By,
     * with X,Y as the pixel location to click
     * @param xLocation - the x location to click as an int
     * @param yLocation the y location
     */
    public static void clickArea(WebElement elementBy, int xLocation, int yLocation) {
        Actions builder = new Actions(DriverManager.getCurrent());
        builder.moveToElement(elementBy, xLocation, yLocation).click().build().perform();
    }

    /**
     * Waits for an element to fully hit the page (loaded into DOM and visible to the naked eye) before clicking the
     * element. This is to be used in place of assuming that WebDriver's implicit wait will adequately wait for your
     * element to appear. Please use this method for all your clicking needs. Specify int parameter for multiple
     * elements on page
     *
     * @param element thing you want to click
     * @param num index of element
     * @return WebElement of the element that was clicked. Note that in most cases this element will be stale, which
     * could be a useful thing to wait for.
     */
    public static WebElement loadAndClick(By element, int num) {
        return loadAndClick(waitForEnabled(element, num));
    }

    /**
     * Waits for an element to fully hit the page (loaded into DOM and visible to the naked eye) before clicking the
     * element. This is to be used in place of assuming that WebDriver's implicit wait will adequately wait for your
     * element to appear. Please use this method for all your clicking needs.
     *
     * @param element thing you want to click
     * @return WebElement of the element that was clicked. Note that in most cases this element will be stale, which
     * could be a useful thing to wait for.
     */
    public static WebElement loadAndClick(WebElement element) {
        waitForEnabled(element);
        scrollToElement(element);
        try {
            element.click();
            PageUtils.waitForPageLoaded(DriverManager.getCurrent(), 20, 500L, 0, 0);
        } catch (TestException | VeevaTimeoutException e) {
            throw new TimeoutException(
                    "loadAndClick could NOT find element: " + element.toString() + " - " + takeScreenshot(), e);
        } catch (StaleElementReferenceException e) {
            throw new StaleElementReferenceException(
                    "loadAndClick failed for element: " + element.toString() + " - " + takeScreenshot(), e);
        } catch (RuntimeException e) {
            throw new RuntimeException(
                    "loadAndClick failed for element: " + element.toString() + " - " + takeScreenshot(), e);
        }
        return element;
    }

    /**
     * <p>
     * Click an element after it has fully loaded and become enabled. This method differs from {@link #loadAndClick(By)}
     * in that it doesn't explicitly scroll to the element before clicking on it, which may alleviate some issues from
     * undesired scrolling.
     * </p>
     * <p>
     * Note that there is an implicit scroll in Selenium's built-in click method, so some scrolling may occur if the
     * element is not in the viewport. Still, <strong>this method should only be used if you are experiencing issues
     * with {@link #loadAndClick(By)} due to explicitly scrolling and only when you know for certain that the element is
     * in the viewport and not covered by any other elements (i.e. the floating header).</strong>
     * </p>
     *
     * @param element Element to click.
     * @return WebElement of the element that was clicked. Note that in most cases this element will be stale, which
     * could be a useful thing to wait for.
     */
    public static WebElement loadAndClickWithoutExplicitlyScrollingTo(final By element) {
        return loadAndClickWithoutExplicitlyScrollingTo(waitForEnabled(element));
    }

    /**
     * <p>
     * Click the nth element after it has fully loaded and become enabled. This method differs from {@link
     * #loadAndClick(By, int)} in that it doesn't explicitly scroll to the element before clicking on it, which may
     * alleviate some issues from undesired scrolling.
     * </p>
     * <p>
     * Note that there is an implicit scroll in Selenium's built-in click method, so some scrolling may occur if the
     * element is not in the viewport. Still, <strong>this method should only be used if you are experiencing issues
     * with {@link #loadAndClick(By, int)} due to explicitly scrolling and only when you know for certain that the
     * element is in the viewport and not covered by any other elements (i.e. the floating header).</strong>
     * </p>
     *
     * @param element Element to click.
     * @param index Index of element to click, starting from 0.
     * @return WebElement of the element that was clicked. Note that in most cases this element will be stale, which
     * could be a useful thing to wait for.
     */
    public static WebElement loadAndClickWithoutExplicitlyScrollingTo(final By element, final int index) {
        return loadAndClickWithoutExplicitlyScrollingTo(waitForEnabled(element, index));
    }

    /**
     * <p>
     * Click an element after it has fully loaded and become enabled. This method differs from {@link
     * #loadAndClick(WebElement)} in that it doesn't explicitly scroll to the element before clicking on it, which may
     * alleviate some issues from undesired scrolling.
     * </p>
     * <p>
     * Note that there is an implicit scroll in Selenium's built-in click method, so some scrolling may occur if the
     * element is not in the viewport. Still, <strong>this method should only be used if you are experiencing issues
     * with {@link #loadAndClick(WebElement)} due to explicitly scrolling and only when you know for certain that the
     * element is in the viewport and not covered by any other elements (i.e. the floating header).</strong>
     * </p>
     *
     * @param element Element to click.
     * @return WebElement of the element that was clicked. Note that in most cases this element will be stale, which
     * could be a useful thing to wait for.
     */
    public static WebElement loadAndClickWithoutExplicitlyScrollingTo(final WebElement element) {
        waitForEnabled(element);
        try {
            element.click();
        } catch (RuntimeException e) {
            throw new RuntimeException(
                    "loadAndClick failed for element: " + element.toString() + " - " + takeScreenshot(), e);
        }
        return element;
    }

    /**
     * Wait for the main window scroll to stop scrolling, will stop waiting after 3 seconds if scroll did not move. will
     * not throw exception if the scroll did not stop moving after 20 seconds.
     */
    public static void waitForScrollToStopMoving() {
        if (waitForScrollToMove(1) == null) { // wait for 1 seconds for scroll
            // to move
            return; // stop waiting because the scroll did not move
        }
        int startTime = (int) TimeUnit.SECONDS.convert(System.nanoTime(), TimeUnit.NANOSECONDS);
        int endTime = startTime;
        JavascriptExecutor executor = (JavascriptExecutor) DriverManager.getCurrent();
        // check if the element has moved or not, return if moved
        while (endTime - startTime < Driver.TIMEOUT_20_SEC) {
            Object initialLocation = executor.executeScript("return window.scrollY");
            Sleeper.sleepTight(50);
            if (initialLocation.equals(executor.executeScript("return window.scrollY"))) {
                return;
            }
            endTime = (int) (System.nanoTime() / 1000000000);
        }
    }

    /**
     * Wait for the given scroll found via JQuery to stop moving
     *
     * @param jQuery The jQuery that goes with identifying the element
     */
    public static void waitForScrollToStopMoving(String jQuery) {
        int startTime = (int) (System.nanoTime() / 1000000000);
        int endTime = startTime;
        JavascriptExecutor executor = (JavascriptExecutor) DriverManager.getCurrent();
        // check if the element has moved or not, return if moved
        while (endTime - startTime < Driver.TIMEOUT_20_SEC) {
            Long initialLocation = (Long) executor.executeScript(jQuery);
            Sleeper.sleepTight(50);
            if (initialLocation.equals(executor.executeScript(jQuery))) {
                return;
            }
            endTime = (int) (System.nanoTime() / 1000000000);
        }
    }

    /**
     * Wait for the main window scroll to start scrolling, will not throw exception if element did not move.
     *
     * @param timeout time to wait in seconds
     * @return initial position of the scroll in Long
     */
    private static Object waitForScrollToMove(int timeout) {
        int startTime = (int) (System.nanoTime() / 1000000000);
        int endTime = startTime;
        JavascriptExecutor executor = (JavascriptExecutor) DriverManager.getCurrent();
        Object intialLocation = executor.executeScript("return window.scrollY");
        // check if the element has moved or not, return if moved
        while (endTime - startTime < timeout) {
            if (!intialLocation.equals(executor.executeScript("return window.scrollY"))) {
                return intialLocation;
            }
            endTime = (int) (System.nanoTime() / 1000000000);
            Sleeper.sleepTight(50);
        }
        return null;
    }

    /**
     * Load and enter click.
     *
     * @param element the element
     */
    public static void loadAndEnterClick(By element) {
        waitForLoad(element);
        enterClick(element);
    }

    /**
     * Clicks an element by sending {@link Keys#ENTER} to it instead of calling {@link WebElement#click()}. This can be
     * a workaround for when clicks don't seem to be doing anything for an element.
     *
     * @param element By object representing the element you wish to "click".
     */
    public static void enterClick(By element) {
        enterClick(get(element));
    }

    /**
     * Enter click.
     *
     * @param we the we
     */
    public static void enterClick(WebElement we) {
        waitForVisible(we);
        new Actions(DriverManager.getCurrent()).sendKeys(we, Keys.ENTER).perform();
    }

    /**
     * Double click.
     *
     * @param we the we
     */
    public static void doubleClick(WebElement we) {
        Actions action = new Actions(DriverManager.getCurrent());
        action.doubleClick(we).perform();
    }

    /**
     * Double click.
     *
     * @param we the we
     */
    public static void clickTwice(WebElement we) {
        Actions action = new Actions(DriverManager.getCurrent());